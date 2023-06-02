package com.example.dbshop.activities

import android.app.Application
import com.example.dbshop.db.MainDataBase

class MainApp: Application() {
    val dataBase by lazy { MainDataBase.getDataBase(this) }
}