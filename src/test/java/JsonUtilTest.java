import com.mohammad.JsonUtil;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class JsonUtilTest {
    @Test
    @Order(1)
    @DisplayName("Should have no mismatch false.")
    void testJsonMatch() {
        String a = "{\"id\":1, \"name\":\"Mohammad\"}";
        String b = "{\"id\":1, \"name\":\"Mohammad\"}";

        assertFalse(JsonUtil.hasMismatch(a, b));
    }
    @Test
    @Order(2)
    @DisplayName("Should have mismatch true.")
    void testJsonMismatchValue() {
        String a = "{\"id\":1,\"name\":\"Mohammad\"}";
        String b = "{\"id\":1,\"name\":\"Rahman\"}";

        assertTrue(JsonUtil.hasMismatch(a, b));
    }
    @Test
    @Order(3)
    @DisplayName("Should have mismatch key true.")
    void testMismatchKey() {
        String a = "{\"id\":1}";
        String b = "{\"id\":1,\"name\":\"Mohammad\"}";

        assertTrue(JsonUtil.hasMismatch(a, b));
    }
    @Test
    @Order(4)
    @DisplayName("Should have invalid json true.")
    void testInvalidJson() {
        assertTrue(JsonUtil.hasMismatch("{bad json}", "{\"id\":1}"));
    }
}
