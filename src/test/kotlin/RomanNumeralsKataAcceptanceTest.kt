
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsKataAcceptanceTest {

    @Test
    fun `it should convert 1 to roman numeral`(){
        assertEquals(convert(1), "I")
    }

    @Test
    fun `it should convert 2 to roman numeral`(){
        assertEquals(convert(2), "II")
    }

    @Test
    fun `it should convert 3 to roman numeral`(){
        assertEquals(convert(3), "III")
    }

    @Test
    fun `it should convert 4 to roman numeral`(){
        assertEquals(convert(4), "IV")
    }

    @Test
    fun `it should convert 14 to roman numeral`(){
        assertEquals(convert(14), "XIV")
    }

    @Test
    fun `it should convert 29 to roman numeral`(){
        assertEquals(convert(29), "XXIX")
    }

    @Test
    fun `it should convert 54 to roman numeral`(){
        assertEquals(convert(54), "LIV")
    }

    @Test
    fun `it should convert 99 to roman numeral`(){
        assertEquals(convert(99), "IC")
    }

    @Test
    fun `it should convert 101 to roman numeral`(){
        assertEquals(convert(101), "CI")
    }

    @Test
    fun `it should convert 199 to roman numeral`(){
        assertEquals(convert(199), "CIC")
    }

    @Test
    fun `it should convert 523 to roman numeral`(){
        assertEquals(convert(523), "DXXIII")
    }

    @Test
    fun `it should convert 1719 to roman numeral`(){
        assertEquals("MDCCXIX", convert(1719))
    }

    @Test
    fun `it should convert 3724 to roman numeral`(){
        assertEquals("MMMDCCXXIV", convert(3724))
    }

    @Test
    fun `it should convert 79 to roman numeral`(){
        assertEquals("LXXIX", convert(79))
    }

    @Test
    fun `it should convert 904 to roman numeral`(){
        assertEquals("CMIV", convert(904))
    }

    @ParameterizedTest
    @CsvSource("CMIV,904",
        "DXXV,525",
        "XXVII,27",
        "LIII,53",
        "DLXVII,567",
        "CLXXIX,179",
        "CV,105",
        "CMXVI,916",
        "DXCVI,596",
        "XXXVI,36")
    internal fun name(roman:String,number:Int) {
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
            3 to "III",
            2 to "II",
            1 to "I")
        while (tempNumber > 0){
            for ((k,v) in numbers){
                if(tempNumber >= k){
                    result += v
                    tempNumber -= k
                    break
                }
            }
        }
        return result
    }
}