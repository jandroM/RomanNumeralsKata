import org.junit.Assert
import org.junit.Test

class RomanNumeralsKataAcceptanceTest {

    @Test
    fun `it should convert 1 to roman numeral`(){
        Assert.assertEquals(convert(1), "I")
    }

    @Test
    fun `it should convert 2 to roman numeral`(){
        Assert.assertEquals(convert(2), "II")
    }

    @Test
    fun `it should convert 3 to roman numeral`(){
        Assert.assertEquals(convert(3), "III")
    }

    @Test
    fun `it should convert 4 to roman numeral`(){
        Assert.assertEquals(convert(4), "IV")
    }

    @Test
    fun `it should convert 14 to roman numeral`(){
        Assert.assertEquals(convert(14), "XIV")
    }

    @Test
    fun `it should convert 29 to roman numeral`(){
        Assert.assertEquals(convert(29), "XXIX")
    }

    @Test
    fun `it should convert 54 to roman numeral`(){
        Assert.assertEquals(convert(54), "LIV")
    }

    private fun convert(number: Int): String {
        var result  = ""
        var tempNumber = number
        val numbers = mapOf(50 to "L", 20 to "XX", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV",3 to "III", 2 to "II", 1 to "I")
        while (tempNumber > 0){
            numbers.forEach{(k,v)->
                if(tempNumber >= k){
                    result += v
                    tempNumber -= k
                }
            }
        }
        return result
    }
}