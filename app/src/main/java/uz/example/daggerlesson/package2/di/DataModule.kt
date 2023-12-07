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
interface DataModule {
    @Binds
    fun bindExampleLocalDataSource(impl:ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}