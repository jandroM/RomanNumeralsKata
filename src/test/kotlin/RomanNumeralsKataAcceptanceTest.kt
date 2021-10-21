import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsKataAcceptanceTest {

    @Test
    fun `it should do whatever`(){
        assertEquals("I", convert(1))
        assertEquals("II", convert(2))
    }

    private fun convert(number: Int): String {
        if (number == 1) return "I"
        else return "II"
    }
}