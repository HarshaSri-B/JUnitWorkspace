package com.example.demo.ordersBo;

import com.example.demo.Orders.Order;

public interface OrderBo {
 boolean placeOrder(Order order) throws BOException;
 
 boolean cancelOrder(int id) throws BOException;
 
 boolean deleteOrder(int id) throws BOException;
}
