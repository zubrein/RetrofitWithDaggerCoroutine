package xit.zubrein.retrofitwithdaggercoroutine.network

import xit.zubrein.retrofitwithdaggercoroutine.model.PostModel
import javax.inject.Inject

class ServiceImp @Inject constructor(private val apiService: ApiService) {

    suspend fun getPost() :List<PostModel> = apiService.getPost()


}