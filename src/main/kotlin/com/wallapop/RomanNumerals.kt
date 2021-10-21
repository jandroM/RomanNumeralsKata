package com.wallapop

fun convert(number: Int): String {
    var result  = ""
    var tempNumber = number
    val numbers = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        100 to "C",
        99 to "IC",
        90 to "XC",
        50 to "L",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I")
    while (tempNumber > 0){
        for ((key,value) in numbers){
            if(tempNumber >= key){
                result += value
                tempNumber -= key
                break
            }
        }
    }
    return result
}