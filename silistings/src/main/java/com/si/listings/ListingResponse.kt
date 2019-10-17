package com.si.listings

import com.si.Gson.AssetResponse
import com.si.service.ApiFactory
import kotlinx.coroutines.*
import retrofit2.Response
import java.lang.Exception

class ListingResponse {
    companion object {

       var apiResponse: onApiResponse? = null

       fun getListingResponse(url: String) {
            // Following function can be used for getting response of Listing apis of News Photos and Videos
            GlobalScope.launch(Dispatchers.Main) {
                try {
                    val result=startServiceResponse(url)
                    if (result.isSuccessful){
                        apiResponse?.onSucess(result.body())
                    }else{
                        apiResponse?.onError(result.errorBody().toString())
                    }
                } catch (e: Exception) {
                    apiResponse?.onError(e.toString())
                }


            }
        }

        suspend fun startServiceResponse(url:String) : Response<AssetResponse> {
            return withContext(Dispatchers.IO){
                ApiFactory.siMultiSportApi.getLatestNewsAsync(url)
            }
        }

        interface onApiResponse {
            fun onSucess(assetResponse: AssetResponse?)
            fun onError(error: String?)
        }
    }
}
  /*  public fun getListingResponse(url: String) {

        GlobalScope.launch(Dispatchers.IO) {
            val service = ApiFactory.siMultiSportApi
            val userRequest = service.getLatestNewsAsync(url)
            try {
                val response = userRequest
                if (response.isSuccessful) {
                    GlobalScope.launch(Dispatchers.Main) {
                        apiResponse?.onSucess(response.body())
                    }
                } else {
                    apiResponse?.onError(response.errorBody().toString())
                }

            } catch (e: Exception) {
                apiResponse?.onError(e.toString())
            }

        }*/