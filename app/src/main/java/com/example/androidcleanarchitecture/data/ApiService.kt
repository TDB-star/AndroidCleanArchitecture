package com.example.androidcleanarchitecture.data

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor() {

    fun method() {
        Log.d(LOG_TAG, "ApiService")
    }

    companion object {
        private const val LOG_TAG = "API_SERVICE_TEST"
    }
}