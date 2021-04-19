package com.birendra.Lensdaysos.response

import com.birendra.Lensdaysos.entity.User

data class LoginResponse(val success:Boolean?=null,val message:String?=null,val token:String?=null,val data: User?=null)