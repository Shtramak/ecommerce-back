package com.shtramak.ecommerce.repository;

import com.shtramak.ecommerce.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product-category", collectionResourceRel = "productCategory")
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {
}
