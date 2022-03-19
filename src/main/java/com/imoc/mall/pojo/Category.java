package com.imoc.mall.pojo;

import java.util.Date;

import lombok.Data;

/**
 * 
 * POJO (plain ordinary java object)
 * Lombok GETTER / SETTER
 * @author jiaronghe
 *
 */

@Data
public class Category {
	
	private Integer id;
	
	private Integer parentId;
	
	private String name;
	
	private Integer status;
	
	private Integer sortOrder;
	
	private Date createTime;
	
	private Date updateTime;
	
}
