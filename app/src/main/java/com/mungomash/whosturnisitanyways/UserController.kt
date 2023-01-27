package com.mungomash.whosturnisitanyways

import com.mungomash.whosturnisitanyways.models.User
import kotlinx.coroutines.*


class UserController() {

    val users: MutableList<User> = mutableListOf()

//    suspend fun getAll() = coroutineScope {
//        launch {
//            db.collection("users").get().documents.map {
//                users.add(User(it.id, it.get("dollarsSpent"), it.get("name")))
//            }
//        }
//    }
}