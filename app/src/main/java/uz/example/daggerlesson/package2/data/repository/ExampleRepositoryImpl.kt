package uz.example.daggerlesson.package2.data.repository

import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import uz.example.daggerlesson.package2.data.datasource.ExampleLocalDataSource
import uz.example.daggerlesson.package2.data.datasource.ExampleRemoteDataSource
import uz.example.daggerlesson.package2.data.mapper.ExampleMapper
import uz.example.daggerlesson.package2.data.network.ExampleApiService
import uz.example.daggerlesson.package2.di.ProdQualifier
import uz.example.daggerlesson.package2.di.TestQualifier
import uz.example.daggerlesson.package2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor (
    private val database: ExampleLocalDataSource,
    @ProdQualifier private val apiService: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
):ExampleRepository {

    override fun method() {
        mapper.map()
        database.method()
        apiService.method()
    }
}