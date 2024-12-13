package com.example.coffeemachine.coffee

import androidx.collection.intIntMapOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import com.example.coffeemachine.Coffee
import com.example.coffeemachine.CoffeeDecorator
 var counter by mutableIntStateOf(0)

class SugarDecorator(coffee: Coffee?): CoffeeDecorator(coffee) {
    var s = super.ingridients()
    override fun price(): Double {
        return super.price() +  15.00
    }


    override fun ingridients(): MutableList<String> {
        if (counter == 0) {
            s += "Сахар"
            counter+=1
        }
        return s
    }

    fun addSugar():String{
        counter++
        var r = "⬛".repeat(counter)
        return r
    }

}





//        counter+=1+125 power point+ qbasiq= sin doble +
//                maga isma // direkt facking + obsorber
//        conter strike + bombermen = intIntMapOf()