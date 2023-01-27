package com.mungomash.whosturnisitanyways.models

data class Order(val id: String, val cost: Double, val payer: String, val restaurant: String, val delivery: Boolean, val deliveryFee: Double)
