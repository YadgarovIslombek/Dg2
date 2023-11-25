package uz.example.daggerlesson.package2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.example.daggerlesson.R
import uz.example.daggerlesson.package1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.keyboard.toString()
    }
}