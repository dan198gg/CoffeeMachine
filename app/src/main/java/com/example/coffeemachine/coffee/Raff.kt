package com.example.coffeemachine.coffee

import com.example.coffeemachine.Coffee

class Raff: Coffee {
    override fun name(): String {
        return "Раф"
    }

    override fun price(): Double {
        return 420.00
    }

    override fun ingridients(): MutableList<String> {
        return mutableListOf("Кофе", "Вода", "Сливки")
    }
}

