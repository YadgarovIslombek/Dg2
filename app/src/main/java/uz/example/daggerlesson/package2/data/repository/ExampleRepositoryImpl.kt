package uz.example.daggerlesson.package2.data.repository

import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import uz.example.daggerlesson.package2.data.mapper.ExampleMapper
import uz.example.daggerlesson.package2.data.network.ExampleApiService
import uz.example.daggerlesson.package2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor (
    private val database: ExampleDatabase,
    private val apiService: ExampleApiService,
    private val mapper: ExampleMapper
):ExampleRepository {
    override fun method() {
        mapper.map()
        database.method()
        apiService.method()
    }
}