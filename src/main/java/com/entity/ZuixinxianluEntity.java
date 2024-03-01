package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 最新线路
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
@TableName("zuixinxianlu")
public class ZuixinxianluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuixinxianluEntity() {
		
	}
	
	public ZuixinxianluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 线路名称
	 */
					
	private String xianlumingcheng;
	
	/**
	 * 线路分类
	 */
					
	private String xianlufenlei;
	
	/**
	 * 封面图
	 */
					
	private String fengmiantu;
	
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 出发地
	 */
					
	private String chufadi;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 交通方式
	 */
					
	private String jiaotongfangshi;
	
	/**
	 * 出行时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chuxingshijian;
	
	/**
	 * 费用包含
	 */
					
	private String feiyongbaohan;
	
	/**
	 * 行程路线
	 */
					
	private String xingchengluxian;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：线路名称
	 */
	public void setXianlumingcheng(String xianlumingcheng) {
		this.xianlumingcheng = xianlumingcheng;
	}
	/**
	 * 获取：线路名称
	 */
	public String getXianlumingcheng() {
		return xianlumingcheng;
	}
	/**
	 * 设置：线路分类
	 */
	public void setXianlufenlei(String xianlufenlei) {
		this.xianlufenlei = xianlufenlei;
	}
	/**
	 * 获取：线路分类
	 */
	public String getXianlufenlei() {
		return xianlufenlei;
	}
	/**
	 * 设置：封面图
	 */
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：出发地
	 */
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：交通方式
	 */
	public void setJiaotongfangshi(String jiaotongfangshi) {
		this.jiaotongfangshi = jiaotongfangshi;
	}
	/**
	 * 获取：交通方式
	 */
	public String getJiaotongfangshi() {
		return jiaotongfangshi;
	}
	/**
	 * 设置：出行时间
	 */
	public void setChuxingshijian(Date chuxingshijian) {
		this.chuxingshijian = chuxingshijian;
	}
	/**
	 * 获取：出行时间
	 */
	public Date getChuxingshijian() {
		return chuxingshijian;
	}
	/**
	 * 设置：费用包含
	 */
	public void setFeiyongbaohan(String feiyongbaohan) {
		this.feiyongbaohan = feiyongbaohan;
	}
	/**
	 * 获取：费用包含
	 */
	public String getFeiyongbaohan() {
		return feiyongbaohan;
	}
	/**
	 * 设置：行程路线
	 */
	public void setXingchengluxian(String xingchengluxian) {
		this.xingchengluxian = xingchengluxian;
	}
	/**
	 * 获取：行程路线
	 */
	public String getXingchengluxian() {
		return xingchengluxian;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
