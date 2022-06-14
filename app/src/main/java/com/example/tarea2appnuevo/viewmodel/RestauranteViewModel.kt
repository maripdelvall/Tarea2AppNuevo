package com.example.tarea2appnuevo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RestauranteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is restaurante Fragment"
    }
    val text: LiveData<String> = _text
}