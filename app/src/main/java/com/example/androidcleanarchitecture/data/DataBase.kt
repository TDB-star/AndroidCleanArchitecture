package com.example.androidcleanarchitecture.data

import android.util.Log
import javax.inject.Inject

class DataBase @Inject constructor() {

    fun method() {

        Log.d(LOG_TAG, "Database")
    }

    companion object {
        private const val LOG_TAG = "DATABASE_TEST"
    }
}