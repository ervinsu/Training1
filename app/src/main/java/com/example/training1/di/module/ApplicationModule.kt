package com.example.training1.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule (private val application: Application){


    @Provides
    fun provideActivity(): Context = application

//    @Provides
//    fun providePresenter(): MainContract.Presenter {
//        return MainPresenter()
//    }
}