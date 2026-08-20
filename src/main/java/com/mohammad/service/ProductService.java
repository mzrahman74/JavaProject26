package com.mohammad.service;

/*
This service demonstrates standard collections operations:
ArrayList: Filtering elements where sequence and collection size matter.
HashMap: Categorizing/grouping items by key.
HashSet: Aggregating values while automatically removing duplicates.
 */

import com.mohammad.utility.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ProductService {
  /**
   * ArrayList Example Filters products matching a price threshold. Preserve insertion order in the
   * resulting list.
   */
  private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

  public List<Product> filterProductsByPriceRange(
      List<Product> products, double minPrice, double maxPrice) {
    if (products == null) return Collections.emptyList();

    List<Product> filteredList = new ArrayList<>();
    for (Product product : products) {
      if (product.price() >= minPrice && product.price() <= maxPrice) {
        filteredList.add(product);
      }
    }
    return filteredList;
  }

  /** HashMap example: groups products into lists keyed by their category name. */
  public Map<String, List<Product>> groupProductCategory(List<Product> products) {
    if (products == null) return Collections.emptyMap();

    Map<String, List<Product>> categoryMap = new HashMap<>();
    for (Product product : products) {
      categoryMap.computeIfAbsent(product.category(), k -> new ArrayList<>()).add(product);
    }
    return categoryMap;
  }

  /**
   * HashSet example: Collects all distinct tags across all products and automatically eliminates
   * duplicates.
   */
  public Set<String> extractUniqueTags(List<Product> products) {
    if (products == null) return Collections.emptySet();

    Set<String> uniqueTags = new HashSet<>();
    for (Product product : products) {
      if (product.tags() != null) {
        uniqueTags.addAll(product.tags());
      }
    }
    return uniqueTags;
  }
}
