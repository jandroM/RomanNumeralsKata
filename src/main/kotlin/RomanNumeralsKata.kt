open class RomanNumeralsKata {
    fun convert(number: Int): String {
        return printRomanNumber(number)
    }

    private fun printRomanNumber(times: Int): String {
        var returnValue = ""
        for(i in 1..times){
            when (i) {
                5 -> returnValue = "V"
                4 -> returnValue = "IV"
                else ->returnValue += "I"
            }
        }
        return returnValue
    }
}