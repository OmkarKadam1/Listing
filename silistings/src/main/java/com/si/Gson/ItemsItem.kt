package com.si.Gson


import com.google.gson.annotations.SerializedName


data class ItemsItem(

	@field:SerializedName("total_assets")
	val totalAssets: Any? = null,

	@field:SerializedName("user_name")
	val userName: String? = null,

	@field:SerializedName("primary_entity_name")
	val primaryEntityName: String? = null,

	@field:SerializedName("published_version_number")
	val publishedVersionNumber: Int? = null,

	@field:SerializedName("asset_id")
	val assetId: Int? = null,

	@field:SerializedName("secondary_entity_name")
	val secondaryEntityName: String? = null,

	@field:SerializedName("duration")
	val duration: Any? = null,

	@field:SerializedName("asset_type_id")
	val assetTypeId: Int? = null,

	@field:SerializedName("title_alias")
	val titleAlias: String? = null,

	@field:SerializedName("pri_ent_disp_name")
	val priEntDispName: String? = null,

	@field:SerializedName("image_file_name")
	val imageFileName: String? = null,

	@field:SerializedName("asset_list_id")
	val assetListId: Int? = null,

	@field:SerializedName("secondary_entity_role_map_id")
	val secondaryEntityRoleMapId: Int? = null,

	@field:SerializedName("display_name")
	val displayName: String? = null,

	@field:SerializedName("created_by")
	val createdBy: Int? = null,

	@field:SerializedName("tags")
	val tags: Any? = null,

	@field:SerializedName("full_name")
	val fullName: String? = null,

	@field:SerializedName("asset_title")
	val assetTitle: String? = null,

	@field:SerializedName("image_path")
	val imagePath: String? = null,

	@field:SerializedName("updated_by")
	val updatedBy: Int? = null,

	@field:SerializedName("sec_ent_disp_name")
	val secEntDispName: String? = null,

	@field:SerializedName("short_desc")
	val shortDesc: String? = null,

	@field:SerializedName("created_date")
	val createdDate: String? = null,

	@field:SerializedName("updated_date")
	val updatedDate: String? = null,

	@field:SerializedName("author_id")
	val authorId: Int? = null,

	@field:SerializedName("published_date")
	val publishedDate: String? = null,

	@field:SerializedName("primary_entity_role_map_id")
	val primaryEntityRoleMapId: Int? = null
)