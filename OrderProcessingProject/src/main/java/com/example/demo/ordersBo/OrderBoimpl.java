package com.example.demo.ordersBo;

import java.sql.SQLException;

import com.example.demo.Orders.Order;
import com.example.demo.Orders.OrderDao;

public class OrderBoimpl implements OrderBo {

	
	private OrderDao dao;
	
	

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		
		try {
			Order order = dao.read(id);
			order.setStatus("Cancelled");
			int result = dao.update(order);
			
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}
	

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

}
