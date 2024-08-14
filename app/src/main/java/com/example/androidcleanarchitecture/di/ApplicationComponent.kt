package com.example.androidcleanarchitecture.di

import android.content.Context
import com.example.androidcleanarchitecture.presentation.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component


@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

       @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}