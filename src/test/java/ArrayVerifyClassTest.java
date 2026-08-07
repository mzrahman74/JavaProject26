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
    int highestNumber = numberArray.method_two(numbers);
    assertEquals(10000, highestNumber);
  }

  @Test
  @Order(3)
  @DisplayName("Should find the second lowest number.")
  void shouldFindSecondLowestNumber() {
    int[] numbers = {50000, 2, 100, 600, 3, 2, 5};
    int secondLowestNumber = numberArray.method_three(numbers);
    assertEquals(3, secondLowestNumber);
  }
  @Test
  @Order(4)
  @DisplayName("Should pass as a negative test for method_three().")
  void shouldPassNegativeTestSecondLowestNumber() {
    int [] numbers = {4000, 5000, 1000, 900, 5, 6, 4, 50};
    int notSecondLowestNumber = numberArray.method_three(numbers);
    assertNotEquals(4, notSecondLowestNumber);
  }
  @Test
  @Order(5)
  @DisplayName("Should pass as a negative test for method_two().")
  void shouldPassNegativeTestFindHighestNumber(){
    int[] numbers = {10000, 500, 400, 600, 7000, 9000, 5};
    int notHighestNumber = numberArray.method_two(numbers);
    assertNotEquals(7000, notHighestNumber);
  }
  @Test
  @Order(6)
  @DisplayName("Should pass a negative test for method_one().")
  void shouldPassNegativeTestLowestAge() {
    int [] ages = {2, 0, 45, 65, 3, 4, 8};
    int notLowestAge = NumberArray.method_one(ages);
    assertNotEquals(2, notLowestAge);
  }
}
