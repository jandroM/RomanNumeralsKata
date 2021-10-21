import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralsKataAcceptanceTest : RomanNumeralsKata() {

    @Test
    fun `it should convert 7 to the roman numeral interpretaion`(){
        assertEquals("VII", convert(7))
    }

    @Test
    fun `it should convert 6 to the roman numeral interpretaion`(){
        assertEquals("VI", convert(6))
    }

    @Test
    fun `it should convert 5 to the roman numeral interpretaion`(){
        assertEquals("V", convert(5))
    }

    @Test
    fun `it should convert 4 to the roman numeral interpretaion`(){
        assertEquals("IV", convert(4))
    }

    @Test
    fun `it should convert 3 to the roman numeral interpretaion`(){
        assertEquals("III", convert(3))
    }

    @Test
    fun `it should convert 2 to the roman numeral interpretaion`(){
        assertEquals("II", convert(2))
    }

    @Test
    fun `it should convert 1 to the roman numeral interpretaion`(){
        assertEquals("I", convert(1))
    }
}