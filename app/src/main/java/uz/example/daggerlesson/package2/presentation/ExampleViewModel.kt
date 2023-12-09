package uz.example.daggerlesson.package2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import uz.example.daggerlesson.package2.di.ApplicationScope
import uz.example.daggerlesson.package2.di.IdQualifier
import uz.example.daggerlesson.package2.di.NameQualifier
import uz.example.daggerlesson.package2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named


class ExampleViewModel @Inject constructor( //sdsds
    private val exampleUseCase: ExampleUseCase,
    @IdQualifier private val id:String,
    @NameQualifier private val name:String
):ViewModel() {
    fun method(){
        exampleUseCase()
        Log.d("ExampleViewModel", "method: $this $id $name")
    }
}