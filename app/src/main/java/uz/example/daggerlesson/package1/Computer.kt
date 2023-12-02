package uz.example.daggerlesson.package1

import javax.inject.Inject

class Computer (
    val computerTower : ComputerTower,
    val mouse : Mouse,
    val keyboard : Keyboard,
    val monitor : Monitor
)
{
    fun hisobla(){
        println("sdsd")
    }
}