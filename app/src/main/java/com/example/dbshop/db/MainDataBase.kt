package com.example.dbshop.db

import android.content.Context
import androidx.room.*
import com.example.dbshop.entities.LibraryItem
import com.example.dbshop.entities.NoteItem
import com.example.dbshop.entities.ShoppingListItem
import com.example.dbshop.entities.ShoppingListName
@Database (
    entities = [
    LibraryItem::class,
    NoteItem::class,
    ShoppingListItem::class,
    ShoppingListName::class
],
version = 1

)
abstract class MainDataBase:RoomDatabase() {
    abstract fun getDao() : Dao

    companion object{
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE ?: synchronized(this) {
                var instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list.db"
                ).build()
                instance
            }
        }
    }
}