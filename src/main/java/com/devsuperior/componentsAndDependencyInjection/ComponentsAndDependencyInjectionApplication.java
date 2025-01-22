package com.devsuperior.componentsAndDependencyInjection;

import com.devsuperior.componentsAndDependencyInjection.entities.Order;
import com.devsuperior.componentsAndDependencyInjection.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentsAndDependencyInjectionApplication implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ComponentsAndDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.00, 20.0);
        Order order1 = new Order(2282, 800.00, 10.0);
        Order order2 = new Order(1309, 95.90, 0.0);
        System.out.println(orderService.getOrderSummary(order));
        System.out.println(orderService.getOrderSummary(order1));
        System.out.println(orderService.getOrderSummary(order2));

    }

}
