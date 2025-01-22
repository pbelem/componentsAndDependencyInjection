package com.devsuperior.componentsAndDependencyInjection.services;

import com.devsuperior.componentsAndDependencyInjection.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + shippingService.shipment(order);
    }

    public String getOrderSummary(Order order) {
        return String.format("Pedido código %d%nValor total: %.2f", order.getCode(), total(order));
    }
}


