package uz.example.daggerlesson.package2.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import uz.example.daggerlesson.R
import uz.example.daggerlesson.package2.App
import uz.example.daggerlesson.package2.di.DaggerAppComponent

import javax.inject.Inject
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory:ViewModelFactory
    private val componet by lazy {
        (application as App).component
            .getActivityComponentFactory()
            .create("ID","NAME")
   }
    private val viewModel by lazy {
        ViewModelProvider(this,viewModelFactory)[ExampleViewModel::class.java]
    }
    private val viewModel2 by lazy {
        ViewModelProvider(this,viewModelFactory)[ExampleViewModel2::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
       componet.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
        findViewById<TextView>(R.id.txt).setOnClickListener {
            Intent(this,MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}