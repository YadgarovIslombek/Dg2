package uz.example.daggerlesson.package2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(val repository: ExampleRepository) {
    operator fun invoke() = repository.method()
}