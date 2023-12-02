package uz.example.daggerlesson.package2.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Component
import uz.example.daggerlesson.package2.presentation.MainActivity

@Component(modules = [DataModule::class,DomainModule::class])
interface AppComponent {

fun inject(activity: MainActivity)
}