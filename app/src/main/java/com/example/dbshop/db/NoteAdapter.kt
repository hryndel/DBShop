package com.example.dbshop.db
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import com.example.dbshop.R
import com.example.dbshop.databinding.ActivityNoteListItemBinding
import com.example.dbshop.entities.NoteItem

class NoteAdapter: ListAdapter<NoteItem, NoteAdapter.ItemHolder>(ItemComparator()) {

    class ItemHolder(view:View): RecyclerView.ViewHolder(view){
        private val binding = ActivityNoteListItemBinding.bind(view)

        fun setData(note:NoteItem) = with(binding){
            tvTitle.text = note.title
            tvDescription.text =note.content
            tvTime.text = note.time
        }

        companion object{
            fun create(parent:ViewGroup): ItemHolder{
                return ItemHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.activity_note_list_item,parent, false)
                )
            }
        }
    }

    class ItemComparator: DiffUtil.ItemCallback<NoteItem>(){
        override fun areItemsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: NoteItem, newItem: NoteItem): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(getItem(position))
    }
}