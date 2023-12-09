package uz.example.daggerlesson.package2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import uz.example.daggerlesson.package2.presentation.ExampleViewModel
import uz.example.daggerlesson.package2.presentation.ExampleViewModel2

@Module
interface ViewModelModule { // 24fgs

    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    fun bindExampleViewModel(imp:ExampleViewModel):ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    fun bindExampleViewModel2(impl:ExampleViewModel2): ViewModel

}