package uz.example.daggerlesson.package2.di

import dagger.BindsInstance
import dagger.Subcomponent
import uz.example.daggerlesson.package2.presentation.MainActivity
import uz.example.daggerlesson.package2.presentation.MainActivity2
import javax.inject.Named


@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)
    @Subcomponent.Factory
    interface Factory{
       fun create(
           @BindsInstance @IdQualifier id:String,
           @BindsInstance @NameQualifier name:String
       ):ActivityComponent
   }

}