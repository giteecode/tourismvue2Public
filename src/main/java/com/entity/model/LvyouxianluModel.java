package com.entity.model;

import com.entity.LvyouxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅游线路
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
public class LvyouxianluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
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
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
