package uz.example.daggerlesson.package2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor(){
    fun method(){
        Log.d("TEST", "ExampleApiService: ")
    }
}