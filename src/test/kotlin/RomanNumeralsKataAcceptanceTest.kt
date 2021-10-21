import com.wallapop.convert
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
}