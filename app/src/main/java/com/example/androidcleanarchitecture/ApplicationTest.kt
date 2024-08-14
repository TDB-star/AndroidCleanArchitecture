package com.example.androidcleanarchitecture

import android.app.Application
import com.example.androidcleanarchitecture.di.DaggerApplicationComponent

class ApplicationTest: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}