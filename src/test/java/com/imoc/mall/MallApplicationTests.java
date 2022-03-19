package com.imoc.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imoc.mall.dao.CategoryMapper;
import com.imoc.mall.pojo.Category;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {

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
