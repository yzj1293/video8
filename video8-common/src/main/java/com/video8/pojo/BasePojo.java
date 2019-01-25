package com.video8.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;

public class BasePojo implements Serializable{
	private static final long serialVersionUID = 3004309173507428058L;
	@TableField( "create_time")
	private Date createTime;
	@TableField( "update_time")
	private Date updateTime;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
