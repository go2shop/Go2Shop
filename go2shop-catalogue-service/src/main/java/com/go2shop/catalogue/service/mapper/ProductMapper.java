package com.go2shop.catalogue.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.go2shop.catalogue.entity.Product;
import com.go2shop.model.product.ProductDTO;

@Mapper(componentModel = "spring", uses = {})
public interface ProductMapper {

	@Mapping(target = "productReviews", ignore = true)
	public ProductDTO toDto(Product product);
	
	public Product toEntity(ProductDTO product);
}
