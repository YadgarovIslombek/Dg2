package uz.example.daggerlesson.package2.di

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import dagger.BindsInstance
import dagger.Component
import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import uz.example.daggerlesson.package2.presentation.MainActivity
import uz.example.daggerlesson.package2.presentation.MainActivity2
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class,ViewModelModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    //    @Component.Builder
//    interface MyAppComponentBuilder {
//        @BindsInstance
//        fun getContext(application: Application):MyAppComponentBuilder
//
//        @BindsInstance
//        fun getTimer(time:Long):MyAppComponentBuilder
//        fun create():AppComponent
//    }
    @Component.Factory
    interface MyAppComponentBuilder {

        fun create(
            @BindsInstance application: Application,
            @BindsInstance timer: Long,
        ): AppComponent
    }
}
