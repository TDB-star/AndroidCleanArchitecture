package com.example.androidcleanarchitecture.di

import com.example.androidcleanarchitecture.presentation.MainActivity
import dagger.Component


@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}