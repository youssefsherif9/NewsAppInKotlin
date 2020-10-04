package com.example.newsappinkotlin

import android.telecom.Call

interface Api_Services {
    @GET("v2/everything")
    fun getCountry(@Query("api_Key")apiKey:String="4451200787294791a3863b9dcd8c9903",
                   @Query("country")country:String="eg",
        @Query("page") pageNumber: Int = 1): Call<NewsModel>
    @GET("v2/top-headlines")
    fun getTopic(@Query("api_Key")apiKey:String="4451200787294791a3863b9dcd8c9903",
                 @Query("q")topic:String="all",
        @Query("page") pageNumber: Int = 1):Call<NewsModel>

}