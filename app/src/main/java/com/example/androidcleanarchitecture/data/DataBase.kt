package com.example.androidcleanarchitecture.data

import android.content.Context
import android.util.Log
import com.example.androidcleanarchitecture.R
import javax.inject.Inject

class DataBase @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "Database ${context.getString(R.string.app_name)}")
    }

    companion object {
        private const val LOG_TAG = "TEST"
    }
}