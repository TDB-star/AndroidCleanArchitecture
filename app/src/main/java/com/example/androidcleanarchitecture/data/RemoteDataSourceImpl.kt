package com.example.androidcleanarchitecture.data

import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
): RemoteDataSource {
    override fun method() {
        apiService.method()
    }
}