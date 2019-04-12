package com.example.training1.models

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.log

@Singleton
 class User @Inject constructor(){
   // @Inject constructor(id: Int, name: String, username: String):this()


    var id: Int=0
    lateinit var name: String
    lateinit var username: String

    val TAG="Userkt"
    fun teriak(){
        Log.d(TAG,"Usernya")
    }
}

/*
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
*/