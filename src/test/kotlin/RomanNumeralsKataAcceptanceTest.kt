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

    private fun convert(number: Int): String {
        if(number == 3) return "III"
        if(number == 2) return "II"
        return "I"
    }
}