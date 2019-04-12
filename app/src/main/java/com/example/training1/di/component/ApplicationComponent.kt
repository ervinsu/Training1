package com.example.training1.di.component

import android.support.v7.app.AppCompatActivity
import com.example.training1.Application
import com.example.training1.activity.HomeActivity
import com.example.training1.di.MainActivity
import com.example.training1.di.module.ApplicationModule
import com.example.training1.models.User
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun getUser():User

    fun inject(mainActivity: HomeActivity)

    fun injectt(app:Application)
}