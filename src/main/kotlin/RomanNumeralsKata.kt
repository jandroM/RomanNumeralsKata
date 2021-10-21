open class RomanNumeralsKata {
    fun convert(number: Int): String {
        if( number == 4) return "IV"
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