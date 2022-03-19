package com.imoc.mall.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imoc.mall.MallApplicationTests;
import com.imoc.mall.pojo.Category;

public class CategoryMapperTest extends MallApplicationTests {
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void findById() {
		Category category = categoryMapper.findById(1);
		System.out.println(category.getName());
	}

	@Test
	public void queryById() {
		Category category = categoryMapper.queryById(1);
		System.out.println(category.getName());
	}
}
