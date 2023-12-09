package uz.example.daggerlesson.package2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.example.daggerlesson.package2.di.ApplicationScope
import uz.example.daggerlesson.package2.domain.ExampleRepository
import uz.example.daggerlesson.package2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass


class ViewModelFactory @Inject constructor(
    private val viewModelProviders : @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T

    }
}