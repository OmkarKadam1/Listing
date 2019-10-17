package com.si.Gson


import com.google.gson.annotations.SerializedName


data class Content(

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
)