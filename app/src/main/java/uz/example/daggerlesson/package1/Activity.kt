package uz.example.daggerlesson.package1

import javax.inject.Inject

class Activity {
     val keyboard: Keyboard
        get() =DaggerNewComponent.create().getKeyboard()

    init {
        DaggerNewComponent.create().inject(this)
    }
}