package com.example.androidcleanarchitecture.domain

import android.util.Log
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke() {
        Log.d("Tag", "USE_CASE")
    }
}