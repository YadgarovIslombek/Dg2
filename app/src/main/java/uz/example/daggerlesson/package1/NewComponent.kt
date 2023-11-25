package uz.example.daggerlesson.package1

import dagger.Component

@Component
interface NewComponent {

    fun getKeyboard():Keyboard
    fun inject(activity: Activity)

}