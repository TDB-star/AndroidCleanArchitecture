package com.example.androidcleanarchitecture.di

import android.content.Context
import com.example.androidcleanarchitecture.presentation.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component


@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentBuilder {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}