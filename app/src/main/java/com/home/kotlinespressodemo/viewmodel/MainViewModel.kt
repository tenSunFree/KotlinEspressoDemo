package com.home.kotlinespressodemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _signInValue = MutableLiveData<String>()
    val signInValue: LiveData<String>
        get() = _signInValue


    fun signIn(account: String, password: String) {
        val successAccount = "test001"
        val successPassword = "test002"
        val success = "帳號密碼 正確"
        val failure = "帳號密碼 錯誤"
        if (account == successAccount && password == successPassword) {
            _signInValue.value = success
        } else {
            _signInValue.value = failure
        }
    }
}
