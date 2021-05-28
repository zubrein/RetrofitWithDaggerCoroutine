package xit.zubrein.retrofitwithdaggercoroutine

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.catch
import xit.zubrein.retrofitwithdaggercoroutine.model.PostModel


class PostViewModel
@ViewModelInject
constructor(repository: Repository) : ViewModel() {

    val response: LiveData<List<PostModel>> = repository.getPost()
        .catch { e ->
            Log.d("Main", "${e.message}")
        }.asLiveData()

}