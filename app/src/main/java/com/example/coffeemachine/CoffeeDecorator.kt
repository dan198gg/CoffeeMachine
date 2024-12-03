package com.example.coffeemachine

open class CoffeeDecorator(private val coffee: Coffee):Coffee  {
    override fun name(): String {
        return coffee.name()
    }

    override fun price(): Double {
        return coffee.price()
    }

    override fun ingridients(): MutableList<String> {
        return coffee.ingridients()
    }

}