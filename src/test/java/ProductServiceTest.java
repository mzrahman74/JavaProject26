import com.mohammad.service.ProductService;
import com.mohammad.utility.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private ProductService productService;
    private List<Product> sampleProduct;

    @BeforeEach
    void setUp() {
        productService = new ProductService();
        sampleProduct = List.of(
                new Product("P1", "Laptop", "Electronics", 1200.00, List.of("tech", "work", "portable" )),
                new Product("P2", "Mouse", "Electronics", 25.00, List.of("tech", "accessory" )),
                new Product("P3", "Desk", "Furniture", 300.00, List.of("home", "work")),
                new Product("P4", "Chair", "Furniture", 150.00, List.of("home", "comfort" ))
        );
    }
    @Nested
    @DisplayName("ArrayList Operations: filterProductsByPriceRange")
    class ArrayListTest{
        @Test
        @DisplayName("Should return products within price range maintaining list order")
        void shouldFilterByPriceRange() {
            List<Product> result = productService.filterProductsByPriceRange(sampleProduct, 100.00, 500.00);

            assertEquals(2, result.size());
            assertEquals("Desk", result.get(0).name());
            assertEquals("Chair", result.get(1).name());

        }
    }
}
