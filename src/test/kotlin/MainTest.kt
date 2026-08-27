import org.example.isEven
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun `basic addition should work correctly`() {
        val result = 2 + 2
        assertEquals(5, result)
    }

    @Test
    fun `isEven should return true for even number`() {
        val result = isEven(2)
        assertEquals(true, result)
    }
}