package com.example.androidcleanarchitecture.data

import com.example.androidcleanarchitecture.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
): Repository {

    override fun method() {
        TODO("Not yet implemented")
    }
}