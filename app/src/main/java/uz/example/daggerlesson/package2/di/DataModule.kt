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
import uz.example.daggerlesson.package2.data.datasource.TestRemoteDataSourceImpl

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl:ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}