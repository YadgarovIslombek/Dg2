package uz.example.daggerlesson.package2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import uz.example.daggerlesson.package2.di.ApplicationScope
import uz.example.daggerlesson.package2.domain.ExampleUseCase
import javax.inject.Inject


class ExampleViewModel @Inject constructor( //sdsds
    private val exampleUseCase: ExampleUseCase
):ViewModel() {
    fun method(){
        exampleUseCase()
        Log.d("ExampleViewModel", "method: $this")
    }
}