package com.example.androidcleanarchitecture.presentation

import com.example.androidcleanarchitecture.domain.UseCase
import javax.inject.Inject

class ViewModel @Inject constructor(
    private val useCase: UseCase
) {

    fun method(){
        useCase()
    }
}