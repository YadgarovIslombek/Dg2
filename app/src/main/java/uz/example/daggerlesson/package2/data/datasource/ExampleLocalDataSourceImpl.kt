package uz.example.daggerlesson.package2.data.datasource

import uz.example.daggerlesson.package2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl
@Inject constructor(
    val database: ExampleDatabase,
) : ExampleLocalDataSource {
    override fun method() {
        database.method()
    }
}