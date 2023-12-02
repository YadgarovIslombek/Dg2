package uz.example.daggerlesson.package2.data.database

import android.content.Context
import android.util.Log
import uz.example.daggerlesson.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(private val context:Context) {
    fun method(){
        Log.d("TEST", "ExampleDatabase: ${context.getString(R.string.app_name)}")
    }
}