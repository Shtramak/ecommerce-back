package com.shtramak.ecommerce.repository;

import com.shtramak.ecommerce.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "product-category", collectionResourceRel = "productCategory")
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {
}
