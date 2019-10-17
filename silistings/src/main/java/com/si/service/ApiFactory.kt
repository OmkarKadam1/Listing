package com.si.service

import com.si.AppConstants

object ApiFactory{

    val siMultiSportApi : ApiService = RetrofitFactory.retrofit(AppConstants.SI_BASE_URL).create(ApiService::class.java)
}