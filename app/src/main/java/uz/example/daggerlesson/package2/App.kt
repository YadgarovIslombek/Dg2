package uz.example.daggerlesson.package2

import android.app.Application
import uz.example.daggerlesson.package2.di.DaggerAppComponent

class App: Application() {

        val component =DaggerAppComponent.factory().create(
            this,
            System.currentTimeMillis())

}