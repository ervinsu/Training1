package com.example.training1.di.component

import com.example.training1.HomeActivity
import dagger.Component

@Component
interface ProductComponent {
    fun inject(app: HomeActivity)
}