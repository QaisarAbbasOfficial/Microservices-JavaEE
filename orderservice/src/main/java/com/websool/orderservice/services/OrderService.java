package com.websool.orderservice.services;

/*
 * @created 28/09/2022 - 5:51 PM
 * @project microservices-project
 * @package com.websool.orderservice.services
 * @author Qaisar Abbas
 */

import com.websool.orderservice.helpers.Helper;
import com.websool.orderservice.models.request.OrderRequest;
import com.websool.orderservice.models.response.ResponseApi;
import com.websool.orderservice.persistance.entities.OrderEntity;
import com.websool.orderservice.persistance.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public ResponseApi createOrder(OrderRequest request){

        //Generate Order Number
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber(Helper.GenerateOrderNumber());
        orderEntity.setUserId(request.getUserId());
        orderEntity.setProductId(request.getProductId());

        OrderEntity result = orderRepository.save(orderEntity);

        return new ResponseApi(result);
    }

    public ResponseApi getOrders(){
        List<OrderEntity> list = orderRepository.findAll();
        return new ResponseApi(list);
    }
}
