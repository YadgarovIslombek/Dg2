package uz.example.daggerlesson.package2.data.database

import android.app.Application
import android.content.Context
import android.util.Log
import uz.example.daggerlesson.R
import uz.example.daggerlesson.package2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton


class ExampleDatabase @Inject constructor(
    private val application: Application,
    private val timer: Long) {
    fun method(){
        Log.d("TEST", "ExampleDatabase: ${application.getString(R.string.app_name)} $timer  $this")
    }
}