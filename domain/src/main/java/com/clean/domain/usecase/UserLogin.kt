package com.clean.domain.usecase

import com.clean.domain.data.User

/**
 * Created By Tharindu on 8/5/2019
 *
 */
interface UserLogin{
    fun login() : User
}