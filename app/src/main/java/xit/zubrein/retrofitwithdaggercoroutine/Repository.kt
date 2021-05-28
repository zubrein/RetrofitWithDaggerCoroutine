package xit.zubrein.retrofitwithdaggercoroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import xit.zubrein.retrofitwithdaggercoroutine.model.PostModel
import xit.zubrein.retrofitwithdaggercoroutine.network.ServiceImp
import javax.inject.Inject

class Repository @Inject constructor(private val serviceImp: ServiceImp){

    fun getPost():Flow<List<PostModel>> = flow {
        val response = serviceImp.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)

}