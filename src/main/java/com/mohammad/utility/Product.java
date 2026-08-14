package com.mohammad.utility;

import java.util.List;

public record Product(
        String id,
        String name,
        String category,
        double price,
        List<String> tags
) {}
