open class RomanNumeralsKata {
    fun convert(number: Int): String {
        if( number == 4) return "IV"
        if( number == 5) return "V"
        if( number == 6) return "VI"
        return printI(number)
    }

    private fun printI(times: Int): String {
        var returnValue = ""
        for(i in 1..times){
            returnValue += "I"
        }
        return returnValue
    }
}