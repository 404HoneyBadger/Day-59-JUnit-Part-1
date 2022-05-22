package JUnitTest;

import JUnitMathFunctions.HiFriend;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HiFriendTest {

    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        String name = "Name please";
        InputStream input = new ByteArrayInputStream(name.getBytes());
        System.setIn(input);

        assertEquals("Name please", HiFriend.hiFriend());
    }
}