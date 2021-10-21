open class RomanNumeralsKata {
    fun convert(number: Int): String {
        var returnValue = ""

        for(i in 1..number){
            when (i) {
                5 -> returnValue = "V"
                4 -> returnValue = "IV"
                else ->returnValue += "I"
            }
        }

        return returnValue
    }

}
