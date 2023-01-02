package com.example.demo.ordersDto;

import java.sql.SQLException;

import com.example.demo.Orders.Order;
import com.example.demo.Orders.OrderDao;

public class OredrDaoImpl implements OrderDao {
	

	@Override
	public int create(Order order) throws SQLException {
		return 0;
	}

	@Override
	public Order read(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
