package com.michael.mybusinesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val enteprise: String,
    val socialMedia: String,
    val phone: String,
    val email: String
        )