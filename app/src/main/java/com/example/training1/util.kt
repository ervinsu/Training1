package com.example.training1

import android.support.v7.app.AppCompatActivity
import com.example.training1.di.component.ApplicationComponent

val AppCompatActivity.component: ApplicationComponent
get() =  (application as Application).component