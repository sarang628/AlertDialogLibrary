package com.example.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val isPositive = MutableLiveData<Boolean>().apply { value = false }
    val isNegative = MutableLiveData<Boolean>().apply { value = false }
    val isNeutral = MutableLiveData<Boolean>().apply { value = false }
}