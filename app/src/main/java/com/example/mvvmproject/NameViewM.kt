package com.example.mvvmproject


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NameViewM : ViewModel(){

    val mName: MutableLiveData<String> by lazy {
         MutableLiveData<String>()
    }

}