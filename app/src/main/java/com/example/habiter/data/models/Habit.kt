package com.example.habiter.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

//hii

@Parcelize
@Entity(tableName = "habit_table")
data class Habit (
        @PrimaryKey(autoGenerate = true)
        val ID:Int,
        val habit_title:String,
        val habit_description:String,
        val habit_startTime:String,
        val imageId:Int
        ): Parcelable