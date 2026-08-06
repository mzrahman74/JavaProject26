import com.mohammad.NumberArray;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayVerifyClassTest {
  private final NumberArray numberArray = new NumberArray();

  @Test
  @Order(1)
  @DisplayName("Should find the lowest age.")
  void shouldFindLowestAge() {
    int[] ages = {100, 45, 65, 75, 2};
    int lowestAge = NumberArray.method_one(ages);
    assertEquals(2, lowestAge);
  }

  @Test
  @Order(2)
  @DisplayName("Should find the highest number.")
  void shouldFindHighestNumber() {
    int[] numbers = {1000, 6000, 9000, 10000};
    int highesNumber = numberArray.method_two(numbers);
    assertEquals(10000, highesNumber);
  }

  @Test
  @Order(3)
  @DisplayName("Should find the second lowest number.")
  void shouldFindSecondLowestNumber() {
    int[] numbers = {50000, 2, 100, 600, 3, 2, 5};
    int secondLowestNumber = numberArray.method_three(numbers);
    assertEquals(3, secondLowestNumber);
  }
}
