package com.si.service

import com.si.Gson.AssetResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService{

    @GET suspend fun getLatestNewsAsync(@Url baseUrl: String): Response<AssetResponse>
}