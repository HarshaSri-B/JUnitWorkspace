package com.example.demo.ordersBo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.example.demo.Orders.Order;
import com.example.demo.Orders.OrderDao;

@ExtendWith(MockitoExtension.class)
class OrdersBoTestImpl {
	
	//1.stubbing the class
	@Mock
	OrderDao dao;
	
	@InjectMocks
	private OrderBoimpl bo;
	
//	@BeforeEach
//	public void setup() {
//		//we can also use openMocks instead of initMocks 
//		MockitoAnnotations.initMocks(this);
//		
//		bo = new OrderBoimpl();
		
	//}
	

	@Test
	void PlaceOrder_should_create_an_order() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		when(dao.create(any(Order.class))).thenReturn(1);
		
		
		
		boolean result = bo.placeOrder(order);
		
		//asserting
		assertTrue(result);
		
		//3.verifying
		verify(dao).create(order);
		
		
	}
	
	@Test
	void PlaceOrder_should_not_create_an_order() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		when(dao.create(order)).thenReturn(0);
		
		
		
		boolean result = bo.placeOrder(order);
		
		//asserting
		assertFalse(result);
		
		//3.verifying
		verify(dao).create(order);
		
		
	}

	
	@Test
	void PlaceOrder_should__Throw_Exception() throws SQLException, BOException {
		bo.setDao(dao);
		final Order order = new Order();
		
		when(dao.create(order)).thenThrow(SQLException.class);
		Assertions.assertThrows(BOException.class,()->{
			bo.placeOrder(order);
		});
			
		
		
		verify(dao).create(order);
		
		//return result;	
		
	}

	@Test
	void Cancel_order_should_cancel_an_order() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		when(dao.read(123)).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		
		
		
		boolean result = bo.cancelOrder(123);
		
		//asserting
		assertTrue(result);
		
		//3.verifying
		verify(dao).read(123);
		verify(dao).update(order);
		
		
	}


	@Test
	void Cancel_order_should_not_cancel_an_order() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		when(dao.read(123)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		
		
		
		boolean result = bo.cancelOrder(123);
		
		//asserting
		assertFalse(result);
		
		//3.verifying
		verify(dao).read(123);
		verify(dao).update(order);	
	}




	@Test
	void Cancel_order_read_trow_Exception() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		
		doThrow(SQLException.class).when(dao).read(123);
		//when(dao.read(123)).thenThrow(SQLException.class);
		//when(dao.update(order)).thenReturn(0);
		
		
		
		Assertions.assertThrows(BOException.class,()->{
			bo.cancelOrder(123);
		});
		
		
		//3.verifying
		verify(dao).read(123);
		//verify(dao).update(order);	
	}

	@Test
	void Cancel_order_update_trow_Exception() throws SQLException, BOException {
		bo.setDao(dao);
		Order order = new Order();
		
		//2.setting the expectations
		when(dao.read(123)).thenReturn(order);
		
		when(dao.update(order)).thenThrow(SQLException.class);
		
		
		
		Assertions.assertThrows(BOException.class,()->{
			bo.cancelOrder(123);
		});
		
		
		//3.verifying
		verify(dao).update(order);	
	}


	@Test
	void deleteOrder_should_delete_an_Order() throws SQLException, BOException {
		
		
		bo.setDao(dao);
		
		//setting Expectation
		when(dao.delete(123)).thenReturn(1);
		
		boolean result = bo.deleteOrder(123);
		
		assertTrue(result);
		verify(dao).delete(123);
		
	}


	@Test
	void deleteOrder_should_not_delete_an_Order() throws SQLException, BOException {
		
		
		bo.setDao(dao);
		
		//setting Expectation
		when(dao.delete(123)).thenReturn(0);
		
		boolean result = bo.deleteOrder(123);
		
		assertFalse(result);
		verify(dao).delete(123);
		
	}

	
	@Test
	void deleteOrder_should_throw_exception() throws SQLException, BOException {
		
		
		bo.setDao(dao);
		
		Order order = new Order();
		int ORDER_Id = order.getId();
		//setting Expectation
		doThrow(SQLException.class).when(dao).delete(ORDER_Id );
		
		
		
		Assertions.assertThrows(BOException.class, ()->{
			bo.deleteOrder(ORDER_Id);
		});
		verify(dao).delete(ORDER_Id);
		
	}








}
