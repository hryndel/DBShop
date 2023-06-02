package com.example.dbshop.entities

import androidx.room.*

@Entity(tableName = "Library")
data class LibraryItem (
    @PrimaryKey(autoGenerate = true)
    val  id: Int?,

    @ColumnInfo(name = "name")
    val name: String
)