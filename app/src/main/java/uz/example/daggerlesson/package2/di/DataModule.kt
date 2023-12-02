package uz.example.daggerlesson.package2.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import uz.example.daggerlesson.package2.data.datasource.ExampleLocalDataSource
import uz.example.daggerlesson.package2.data.datasource.ExampleLocalDataSourceImpl
import uz.example.daggerlesson.package2.data.datasource.ExampleRemoteDataSource
import uz.example.daggerlesson.package2.data.datasource.ExampleRemoteDataSourceImpl

@Module
class DataModule(private val context: Context) {
    @Provides
    fun bindExampleLocalDataSource(impl:ExampleLocalDataSourceImpl): ExampleLocalDataSource{
        return impl
    }
    @Provides
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource{
        return impl
    }
    @Provides
    fun provides():Context{
        return context
    }
}