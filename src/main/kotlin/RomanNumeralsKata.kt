open class RomanNumeralsKata {
    fun convert(number: Int): String {
        if( number == 4) return "IV"
        if( number == 5) return "V"
        if( number == 6) return "VI"
        return printRomanNumber(number)
    }

    private fun printRomanNumber(times: Int): String {
        var returnValue = ""
        for(i in 1..times){
            if ( i == 5){
                returnValue = "V"
            } else {
                returnValue += "I"
            }
        }
        return returnValue
    }
}