package com.example.dbshop.entities

import androidx.room.*
@Entity(tableName = "NoteItem")
data class NoteItem (
    @PrimaryKey(autoGenerate = true)
    val  id: Int?,

    @ColumnInfo(name = "title")
    val title: String?,

    @ColumnInfo(name = "content")
    val content: String,

    @ColumnInfo(name = "time")
    val time: String,

    @ColumnInfo(name = "category")
    val category: String
)