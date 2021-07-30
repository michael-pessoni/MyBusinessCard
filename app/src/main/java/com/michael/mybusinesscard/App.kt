package com.michael.mybusinesscard

import android.app.Application
import com.michael.mybusinesscard.data.AppDatabase
import com.michael.mybusinesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}