package com.example.dbshop.entities

import androidx.room.*

@Entity(tableName = "Shop_list_item")
data class ShoppingListItem (
        @PrimaryKey(autoGenerate = true)
        val  id: Int?,

        @ColumnInfo(name = "name")
        val name: String,

        @ColumnInfo(name = "itemInfo")
        val itemInfo: String?,

        @ColumnInfo(name = "itemChecked")
        val itemChecked: Int = 0,

        @ColumnInfo(name = "listId")
        val listId: Int,

        @ColumnInfo(name = "itemType")
        val itemType: String = "item"


)