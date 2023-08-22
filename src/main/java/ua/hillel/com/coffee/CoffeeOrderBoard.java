package ua.hillel.com.coffee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.hillel.com.coffee.order.Order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

    private static final Logger LOGGER = LogManager.getLogger(CoffeeOrderBoard.class);

    private final Queue<Order> orderQueue = new LinkedList<>();
    private int orderCounter;
    public void add(String orderLabel, String costumerName){
        LOGGER.info("Add method working");
        if (orderQueue.isEmpty()){
            orderCounter = 1;

            LOGGER.info("Set up orderCounter if orders delivered {}", orderCounter);
        } else {
            orderCounter++;

            LOGGER.info("orderCounter increasing {}", orderCounter);
        }
        Order order = new Order(orderCounter, orderLabel, costumerName);
        LOGGER.info("Creating order {}", order.toString());

        orderQueue.add(order);
    }

    public Order deliver(){
        LOGGER.info("Deleting order from queue [size: {}]", orderQueue.size());
        return orderQueue.poll();
    }

    public Order deliver(int readyOrder){
        LOGGER.info("Deleting order from queue [size: {}]", orderQueue.size());
        for (Order order : orderQueue) {
            if (order.getNumberOfOrder() == readyOrder){
                LOGGER.info("Remove order by orderNumber {}, order {}", readyOrder, order.toString());
                orderQueue.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw(){
        LOGGER.info("draw method working");
        System.out.println();
        System.out.println("========================");
        for (Order order : orderQueue) {
            System.out.println(order.getNumberOfOrder() + " | " + order.getOrderLabel() + " | " + order.getCostumerName());
        }
        System.out.println("========================");
        System.out.println();
    }



}
