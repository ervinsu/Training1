package com.example.training1.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.training1.Application
import com.example.training1.R
import com.example.training1.component
import com.example.training1.models.User
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject lateinit var context:Context
    @Inject lateinit var user:User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        Log.d("Homeactivity",context.toString())
        user.teriak()

    }

}