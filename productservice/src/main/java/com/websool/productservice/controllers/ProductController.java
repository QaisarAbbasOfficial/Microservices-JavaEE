package com.websool.productservice.controllers;

/*
 * @created 28/09/2022 - 4:26 PM
 * @project microservices-project
 * @package com.websool.orderservice.controllers
 * @author Qaisar Abbas
 */

import com.websool.productservice.models.request.ProductRequest;
import com.websool.productservice.models.response.ResponseApi;
import com.websool.productservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("products")
    public ResponseApi createProduct(@RequestBody ProductRequest request){
         return productService.createProduct(request);
    }

    @GetMapping("products")
    public ResponseApi getProducts(){
        return productService.getProducts();
    }
}
