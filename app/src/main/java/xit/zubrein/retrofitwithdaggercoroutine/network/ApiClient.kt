package xit.zubrein.retrofitwithdaggercoroutine.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xit.zubrein.retrofitwithdaggercoroutine.Utils.Contants
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiClient {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(Contants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun providesApiService(retrofit : Retrofit) : ApiService =
        retrofit.create(ApiService::class.java)

}