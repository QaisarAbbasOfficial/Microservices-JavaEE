package com.websool.productservice.services;

/*
 * @created 28/09/2022 - 8:37 PM
 * @project microservices-project
 * @package com.websool.productservice.services
 * @author Qaisar Abbas
 */

import com.websool.productservice.models.request.ProductRequest;
import com.websool.productservice.models.response.ResponseApi;
import com.websool.productservice.persistance.entities.ProductEntity;
import com.websool.productservice.persistance.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ResponseApi createProduct(ProductRequest request){

        ProductEntity product = ProductEntity.builder()
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .quantity(request.getQuantity())
                .image(request.getImage())
                .build();

        productRepository.save(product);
        log.info("Product created against that id : {}" , product.getId());

        return new ResponseApi(product);
    }

    public ResponseApi getProducts() {
        return new ResponseApi(productRepository.findAll());
    }
}
