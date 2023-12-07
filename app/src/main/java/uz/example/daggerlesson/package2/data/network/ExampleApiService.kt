package uz.example.daggerlesson.package2.data.network

import android.app.Application
import android.util.Log
import uz.example.daggerlesson.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val application: Application,
    private val timer: Long,
) {
    fun method() {
        Log.d("TEST", "ExampleApiService: ${application.getString(R.string.app_name)} $timer")
    }
}