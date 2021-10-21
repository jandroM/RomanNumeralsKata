import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsKataAcceptanceTest : RomanNumeralsKata() {

    @Test
    fun `it should do whatever`(){
        assertEquals("I", convert(1))
        assertEquals("II", convert(2))
    }
}