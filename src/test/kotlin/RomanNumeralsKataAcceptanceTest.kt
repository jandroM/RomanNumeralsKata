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

    private fun convert(number: Int): String {
        val numbers = mapOf(1 to "I", 2 to "II", 3 to "III", 4 to "IV")
        return numbers[number]!!
    }
}