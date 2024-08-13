package com.example.androidcleanarchitecture.di

import com.example.androidcleanarchitecture.data.RepositoryImpl
import com.example.androidcleanarchitecture.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}