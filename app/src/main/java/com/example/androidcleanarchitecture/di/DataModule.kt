package com.example.androidcleanarchitecture.di

import com.example.androidcleanarchitecture.data.LocalDataSource
import com.example.androidcleanarchitecture.data.LocalDataSourceImpl
import com.example.androidcleanarchitecture.data.RemoteDataSource
import com.example.androidcleanarchitecture.data.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: LocalDataSourceImpl): LocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDatasource(impl: RemoteDataSourceImpl): RemoteDataSource
}