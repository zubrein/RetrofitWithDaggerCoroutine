package xit.zubrein.retrofitwithdaggercoroutine.network

import retrofit2.http.GET
import xit.zubrein.retrofitwithdaggercoroutine.model.PostModel

interface ApiService {

    @GET("posts")
    suspend fun getPost(): List<PostModel>

}