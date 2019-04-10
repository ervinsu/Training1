package com.example.training1.di.component

import com.example.training1.HomeActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface HomeComponent {
    fun inject(app: HomeActivity)
}