package com.clean.data

import com.clean.domain.data.User
import com.clean.domain.usecase.UserLogin

/**
 * Created By Tharindu on 8/5/2019
 *
 */

class UserLoginImpl : UserLogin {
    override fun login(): User {
        return User("Name", "User Name")
    }
}