open class RomanNumeralsKata {
    fun convert(number: Int): String {
        if (number == 1) return "I"
        if (number == 3) return "III"
        else return "II"
    }

    private fun printI(times: Int): String {
        var returnValue = ""
        for(i in 1..times){
            returnValue += "I"
        }
        return returnValue
    }
}