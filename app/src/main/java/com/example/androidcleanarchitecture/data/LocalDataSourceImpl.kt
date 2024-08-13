package com.example.androidcleanarchitecture.data

import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val dataBase: DataBase
): LocalDataSource {
    override fun method() {
        dataBase.method()
    }
}