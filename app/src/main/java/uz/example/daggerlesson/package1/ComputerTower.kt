package uz.example.daggerlesson.package1

import javax.inject.Inject

class ComputerTower @Inject constructor(
    val processor: Processor,
    val storage: Storage,
    val memory: Memory
)