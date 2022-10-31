package com.websool.orderservice.controllers;

/*
 * @created 28/09/2022 - 4:26 PM
 * @project microservices-project
 * @package com.websool.orderservice.controllers
 * @author Qaisar Abbas
 */

import com.websool.orderservice.models.request.OrderRequest;
import com.websool.orderservice.models.response.ResponseApi;
import com.websool.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("orders")
    public ResponseApi createOrder(@RequestBody OrderRequest request){
         return orderService.createOrder(request);
    }

    @GetMapping("orders")
    public ResponseApi getOrders(){
        return orderService.getOrders();
    }
}
