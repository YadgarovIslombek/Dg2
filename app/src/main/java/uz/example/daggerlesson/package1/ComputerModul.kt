package uz.example.daggerlesson.package1

import dagger.Module
import dagger.Provides

@Module
class ComputerModul {

    @Provides
    fun providesMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun providesComputer(computerTower: ComputerTower,mouse: Mouse,keyboard: Keyboard,monitor: Monitor):Computer{

        return Computer(computerTower, mouse, keyboard, monitor)
    }


}