package com.example.training1.models

import javax.inject.Inject

data class User @Inject constructor(val id: Int, val name: String, val username: String)

/*
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
*/