package com.example.coffeemachine.coffee

import com.example.coffeemachine.Coffee
import com.example.coffeemachine.CoffeeDecorator

class SugarDecorator(coffee: Coffee): CoffeeDecorator(coffee) {
    override fun price(): Double {
        return super.price() + 15.00
    }

    override fun ingridients(): MutableList<String> {
        val s = super.ingridients()
        s.add("Сахар")
        return s
    }
}