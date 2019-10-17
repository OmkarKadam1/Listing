package com.si.Gson


import com.google.gson.annotations.SerializedName


data class Meta(

	@field:SerializedName("pagination")
	val pagination: Pagination? = null,

	@field:SerializedName("message")
	val message: Any? = null
)