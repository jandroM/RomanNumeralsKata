open class RomanNumeralsKata {
    fun convert(number: Int): String {
        var returnValue = ""

        for(i in 1..number){
            if (i > 10) {
                val uni: Int = i % 10
                returnValue = generate(uni, returnValue)
            }
            else {
                returnValue = generate(i, returnValue)
            }
        }

        return returnValue
    }

    private fun generate(i: Int, returnValue: String): String {
        var returnValue1 = returnValue
        when (i) {
            10 -> returnValue1 = "X"
            9 -> returnValue1 = "IX"
            5 -> returnValue1 = "V"
            4 -> returnValue1 = "IV"
            else -> returnValue1 += "I"
        }
        return returnValue1
    }

}
