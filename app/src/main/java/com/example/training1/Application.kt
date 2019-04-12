package com.example.training1

import android.app.Application
import com.example.training1.di.component.ApplicationComponent
import com.example.training1.di.component.DaggerApplicationComponent
import com.example.training1.di.module.ApplicationModule

class Application : Application(){
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }
}