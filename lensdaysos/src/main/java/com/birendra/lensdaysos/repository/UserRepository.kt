package com.birendra.lensdaysos.repository

import com.birendra.lensdaysos.api.ApiRequest
import com.birendra.lensdaysos.api.RetrofitService
import com.birendra.lensdaysos.api.UserAPI
import com.birendra.lensdaysos.response.BookingResponse
import com.birendra.lensdaysos.response.LoginResponse

class UserRepository():ApiRequest() {
    val userAPI = RetrofitService.buildService(UserAPI::class.java)


    suspend fun loginUser(username:String,password:String): LoginResponse
    {
        return apiRequest {
            userAPI.loginUser(username,password)
        }
    }

    suspend fun retrieveBooking(): BookingResponse
    {
        return apiRequest {
            userAPI.retrieveBooking(RetrofitService.token!!)
        }
    }


}