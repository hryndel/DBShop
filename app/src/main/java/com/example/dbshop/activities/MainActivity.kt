package com.example.dbshop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dbshop.R
import com.example.dbshop.databinding.ActivityMainBinding
import com.example.dbshop.fragments.FragmentManager
import com.example.dbshop.fragments.NoteFragment

class MainActivity : AppCompatActivity() {
    lateinit var bindign: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindign = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindign.root)

        setBottomNavListener()
    }

    private fun setBottomNavListener(){
        bindign.btnNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.settings->{

                }
                R.id.notes->{
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)
                }
                R.id.shop_list->{

                }
                R.id.new_item->{

                }

            }
            true
        }

    }
}