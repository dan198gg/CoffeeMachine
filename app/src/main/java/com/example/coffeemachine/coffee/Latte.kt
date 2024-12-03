package com.example.coffeemachine.coffee

import com.example.coffeemachine.Coffee

class Latte: Coffee {
    override fun name(): String {
        return "Латте"
    }

    override fun price(): Double {
        return 400.00
    }

    override fun ingridients(): MutableList<String> {
        return mutableListOf("эспрессо", "молоко")
    }
}