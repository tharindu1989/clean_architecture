package com.clean.test.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.clean.data.UserLoginImpl

/**
 * Created By Tharindu on 8/5/2019
 *
 */

class UserViewModel : ViewModel() {

    fun login() {
        val user = UserLoginImpl()
        Log.e("USER", "${user.login()}")
    }
}