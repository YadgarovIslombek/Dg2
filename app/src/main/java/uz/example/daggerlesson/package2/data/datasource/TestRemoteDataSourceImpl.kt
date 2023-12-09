package uz.example.daggerlesson.package2.data.datasource

import android.util.Log
import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import uz.example.daggerlesson.package2.data.network.ExampleApiService
import javax.inject.Inject


class TestRemoteDataSourceImpl @Inject constructor():ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestRemoteDataSourceImpl", "test: ")
    }
}