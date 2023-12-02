package uz.example.daggerlesson.package1

import dagger.Component

@Component(modules = [ComputerModul::class])
interface NewComponent {

    fun inject(activity: Activity)

}