package com.mohammad.service;
/*
This service demonstrates standard collections operations:
ArrayList: Filtering elements where sequence and collection size matter.
HashMap: Categorizing/grouping items by key.
HashSet: Aggregating values while automatically removing duplicates.
 */


import com.mohammad.utility.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
    /**
     * ArrayList Example Filters products matching a price threshold.
     * Preserve insertion order in the resulting list.
     *
     */
    public List<Product> filterProductsByPriceRange(List<Product> products, double minPrice,  double maxPrice) {
        if (products == null) return Collections.emptyList();

        List<Product> filteredList = new ArrayList<>();
        for(Product product: products) {
            if(product.price() >= minPrice && product.price() <= maxPrice) {
                filteredList.add(product);
            }
        }
        return filteredList;
    }
}
