
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsKataAcceptanceTest {
    @ParameterizedTest
    @CsvSource(
        "I,1",
        "II,2",
        "III,3",
        "IV,4",
        "XIV,14",
        "XXIX,29",
        "LIV,54",
        "IC,99",
        "CI,101",
        "CIC,199",
        "DXXIII,523",
        "MDCCXIX,1719",
        "MMMDCCXXIV,3724",
        "LXXIX,79",
        "CMIV,904",
        "MMMDXXVIII,3528",
        "CMIV,904",
        "DXXV,525",
        "XXVII,27",
        "LIII,53",
        "DLXVII,567",
        "CLXXIX,179",
        "CV,105",
        "CMXVI,916",
        "DXCVI,596",
        "XXXVI,36")
    internal fun `converts a number to a roman numeral`(roman:String, number:Int) {
        assertEquals(roman, convert(number))
    }

    private fun convert(number: Int): String {
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
}