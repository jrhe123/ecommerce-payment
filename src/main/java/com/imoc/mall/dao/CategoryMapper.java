package com.imoc.mall.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.imoc.mall.pojo.Category;

public interface CategoryMapper {

	@Select("select * from mall_category where id = #{id}")
	Category findById(@Param("id") Integer id);
	
	Category queryById(Integer id);
}
