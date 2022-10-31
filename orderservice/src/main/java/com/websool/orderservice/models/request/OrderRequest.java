package com.websool.orderservice.models.request;

import lombok.Getter;
import lombok.Setter;

/*
 * @created 28/09/2022 - 4:44 PM
 * @project microservices-project
 * @package com.websool.orderservice.models.request
 * @author Qaisar Abbas
 */
@Setter
@Getter
public class OrderRequest {
    private Long productId;
    private Long userId;
    private String orderNumber;
}
