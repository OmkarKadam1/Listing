package com.si.Gson


import com.google.gson.annotations.SerializedName


data class AssetResponse(

	@field:SerializedName("ImagesData")
	val imagesData: Any? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("EntityData")
	val entityData: Any? = null,

	@field:SerializedName("RelatedArticle")
	val relatedArticle: Any? = null,

	@field:SerializedName("NextPrev")
	val nextPrev: Any? = null,

	@field:SerializedName("message")
	val message: Any? = null,

	@field:SerializedName("content")
	val content: Content? = null,

	@field:SerializedName("Authodata")
	val authodata: Any? = null,

	@field:SerializedName("status")
	val status: Int? = null,

	@field:SerializedName("ApplicationDomain")
	val applicationDomain: Any? = null
)