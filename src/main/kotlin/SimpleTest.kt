import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {

    @Test
    fun addTwoNosTest() = runBlocking {
        Assert.assertEquals(10,addTwoInts(5,5))
    }
}