package com.example.androidcleanarchitecture.data

import android.content.Context
import android.util.Log
import com.example.androidcleanarchitecture.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ApiService ${context.getString(R.string.app_name)}, $this")
    }

    companion object {
        private const val LOG_TAG = "TEST"
    }
}