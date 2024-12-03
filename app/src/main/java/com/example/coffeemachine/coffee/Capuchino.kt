package com.example.coffeemachine.coffee

import com.example.coffeemachine.Coffee

class Capuchino: Coffee {
    override fun name(): String {
        return "Капучино"
    }

    override fun price(): Double {
        return 380.00
    }

    override fun ingridients(): MutableList<String> {
        return mutableListOf("Молотый кофе", "Пастеризованное молоко", "Вода")
    }
}


