package com.websool.orderservice.persistance.repositories;

/*
 * @created 28/09/2022 - 5:56 PM
 * @project microservices-project
 * @package com.websool.orderservice.persistance.repositories
 * @author Qaisar Abbas
 */

import com.websool.orderservice.persistance.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
