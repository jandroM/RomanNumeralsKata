import org.junit.Assert
import org.junit.Test

class RomanNumeralsKataAcceptanceTest {

    @Test
    fun `it should convert 1 to roman numeral`(){
        Assert.assertEquals(convert(1), "I")
    }

    private fun convert(number: Int): String {
        return "I"
    }
}