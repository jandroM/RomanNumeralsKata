open class RomanNumeralsKata {
    fun convert(number: Int): String {
        var returnValue = ""

        for(i in 1..number){
            when (i) {
                10 -> returnValue = "X"
                9 -> returnValue = "IX"
                5 -> returnValue = "V"
                4 -> returnValue = "IV"
                else ->returnValue += "I"
            }
        }

        return returnValue
    }

}
