import com.mohammad.service.ProductService;
import com.mohammad.utility.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
  private ProductService productService;
  private List<Product> sampleProduct;
  private static final Logger logger = LoggerFactory.getLogger(ProductServiceTest.class);

  @BeforeEach
  void setUp() {
    logger.info("Initializing collections test");
    productService = new ProductService();
    sampleProduct =
        List.of(
            new Product(
                "P1", "Laptop", "Electronics", 1200.00, List.of("tech", "work", "portable")),
            new Product("P2", "Mouse", "Electronics", 25.00, List.of("tech", "accessory")),
            new Product("P3", "Desk", "Furniture", 300.00, List.of("home", "work")),
            new Product("P4", "Chair", "Furniture", 150.00, List.of("home", "comfort")));
  }

  @Nested
  @DisplayName("ArrayList Operations: filterProductsByPriceRange")
  class ArrayListTest {
    @Test
    @DisplayName("Should return products within price range maintaining list order")
    void shouldFilterByPriceRange() {
      List<Product> result =
          productService.filterProductsByPriceRange(sampleProduct, 100.00, 500.00);

      assertEquals(2, result.size());
      assertEquals("Desk", result.get(0).name());
      assertEquals("Chair", result.get(1).name());
    }

    @Test
    @DisplayName("Should return empty Arraylist when no product fall in the range")
    void shouldReturnEmptyListWhenNoMatches() {
      List<Product> result =
          productService.filterProductsByPriceRange(sampleProduct, 5000.00, 10000.00);

      assertNotNull(result);
      assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Should safely handle null input list")
    void shouldHandleNullInput() {
      List<Product> result = productService.filterProductsByPriceRange(null, 0, 100);

      assertNotNull(result);
      assertTrue(result.isEmpty());
    }
  }

  @Nested
  @DisplayName("HashMap Operation: groupProductByCategory")
  class HashMapTest {
    @Test
    @DisplayName("Should group products into map by category key")
    void shouldGroupByCategory() {
      Map<String, List<Product>> grouped = productService.groupProductCategory(sampleProduct);

      assertEquals(2, grouped.size());
      assertTrue(grouped.containsKey("Electronics"));
      assertTrue(grouped.containsKey("Furniture"));

      assertEquals(2, grouped.get("Electronics").size());
      assertEquals(2, grouped.get("Furniture").size());
    }

    @Test
    @DisplayName("Should return empty map when product list is empty")
    void shouldReturnEmptyMapForEmptyList() {
      Map<String, List<Product>> grouped =
          productService.groupProductCategory(Collections.emptyList());

      assertTrue(grouped.isEmpty());
    }
  }
}
