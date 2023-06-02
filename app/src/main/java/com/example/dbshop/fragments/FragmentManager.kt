package com.example.dbshop.fragments

import androidx.appcompat.app.AppCompatActivity
import com.example.dbshop.R

object FragmentManager {
    var currentFragment: BaseFragment? = null

    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity){
        var transaction = activity.supportFragmentManager.beginTransaction()
        .replace(R.id.placeHolder, newFrag)
        .commit()
        currentFragment = newFrag
    }
}