package com.example.coffeemachine

interface Coffee {
    fun name(): String
    fun price(): Double
    fun ingridients(): MutableList<String>
}