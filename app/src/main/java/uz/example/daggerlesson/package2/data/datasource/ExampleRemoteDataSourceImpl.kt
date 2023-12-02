package uz.example.daggerlesson.package2.data.datasource

import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import uz.example.daggerlesson.package2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    val apiService:ExampleApiService):ExampleRemoteDataSource {
    override fun method() {
        apiService.method()
    }
}