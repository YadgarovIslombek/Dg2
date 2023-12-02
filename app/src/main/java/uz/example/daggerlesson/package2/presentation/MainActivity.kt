package uz.example.daggerlesson.package2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.example.daggerlesson.R
import uz.example.daggerlesson.package1.Activity
import uz.example.daggerlesson.package2.di.DaggerAppComponent
import uz.example.daggerlesson.package2.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel:ExampleViewModel
    private val componet by lazy {
        DaggerAppComponent.builder().dataModule(DataModule(this)).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        componet.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()


    }
}