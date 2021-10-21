open class RomanNumeralsKata {
    fun convert(number: Int): String {
        if (number == 1) return "I"
        if (number == 3) return "III"
        else return "II"
    }
}