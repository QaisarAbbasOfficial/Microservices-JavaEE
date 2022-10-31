package com.websool.orderservice.models;

/*
 * @created 29/09/2022 - 10:03 AM
 * @project microservices-project
 * @package com.websool.orderservice.models
 * @author Qaisar Abbas
 */


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "jsonPlaceHolder", url = "http://localhost:8002/")
public interface ProductClient {
    @GetMapping( "/products")
    Object getProducts();
}
