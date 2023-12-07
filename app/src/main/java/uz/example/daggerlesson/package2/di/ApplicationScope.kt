package uz.example.daggerlesson.package2.di

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME) //javaReflect
annotation class ApplicationScope ()