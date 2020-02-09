package com.shtramak.ecommerce.repository;

import com.shtramak.ecommerce.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {
}
