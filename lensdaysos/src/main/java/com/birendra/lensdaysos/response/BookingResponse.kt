package com.birendra.lensdaysos.response

import com.birendra.lensdaysos.entity.BookingLensdays

data class BookingResponse(val success:Boolean?=null,val message:String?=null,val data:MutableList<Bookinglensdays>?=null)