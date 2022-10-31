package com.websool.orderservice.persistance.entities;

/*
 * @created 28/09/2022 - 5:33 PM
 * @project microservices-project
 * @package com.websool.orderservice.persistance.entities
 * @author Qaisar Abbas
 */

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
@DynamicInsert
@DynamicUpdate
public class OrderEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_number", unique = true)
    private String orderNumber;
}
