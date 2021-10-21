import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsKataAcceptanceTest : RomanNumeralsKata() {

    @Test
    fun `it should convert an integer number to their roman numeral interpretation`(){
        assertEquals("I", convert(1))
        assertEquals("II", convert(2))
        assertEquals("III", convert(3))
    }
}