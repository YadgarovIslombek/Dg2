package uz.example.daggerlesson.package2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import uz.example.daggerlesson.package2.data.repository.ExampleRepositoryImpl
import uz.example.daggerlesson.package2.domain.ExampleRepository

@Module
 interface DomainModule {

    @Binds

    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository


}