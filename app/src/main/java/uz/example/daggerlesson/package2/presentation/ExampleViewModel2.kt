package uz.example.daggerlesson.package2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import uz.example.daggerlesson.package2.di.ApplicationScope
import uz.example.daggerlesson.package2.domain.ExampleRepository
import uz.example.daggerlesson.package2.domain.ExampleUseCase
import javax.inject.Inject


class ExampleViewModel2 @Inject constructor(
    private val exampleRepository: ExampleRepository
):ViewModel() {
    fun method(){
        exampleRepository.method();
        Log.d("ExampleViewModel2", "method: $this")
    }
}