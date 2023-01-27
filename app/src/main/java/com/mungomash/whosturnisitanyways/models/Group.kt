package com.mungomash.whosturnisitanyways.models

data class Group(val id: String, val users: List<User>, val name: String, val whoIsUp: String, val orders: List<Order>)
