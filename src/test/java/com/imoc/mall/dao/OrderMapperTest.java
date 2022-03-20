package com.imoc.mall.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imoc.mall.MallApplicationTests;
import com.imoc.mall.pojo.Category;
import com.imoc.mall.pojo.Order;

public class OrderMapperTest extends MallApplicationTests {
	
	@Autowired
	private OrderMapper orderMapper;

	@Test
	public void deleteByPrimaryKey() {
		
	}
	
	@Test
	public void insert() {
		
	}
	
	@Test
	public void insertSelective() {
		
	}
	
	@Test
	public void selectByPrimaryKey() {
		 Order order = orderMapper.selectByPrimaryKey(1);
		 System.out.println(order.getOrderNo());
	}
	
	@Test
	public void updateByPrimaryKeySelective() {
		
	}
	
	@Test
	public void updateByPrimaryKey() {
		
	}
}
