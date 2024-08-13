package com.example.androidcleanarchitecture.data

import com.example.androidcleanarchitecture.domain.Repository

class RepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
): Repository {

    override fun method() {
        TODO("Not yet implemented")
    }
}