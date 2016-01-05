package xyz.hollysys.search.model;

import java.math.BigDecimal;

/**
 * 商品列表页信息
 * @author sanhao
 *
 */
public class Shangpin {
	private int sp_id;
	private String sp_title;
	private int sp_cat1;
	private int sp_cat2;
	private String sp_img_url;
	private String sp_vidio_url;
	private int sp_price;
	public int getSp_id() {
		return sp_id;
	}
	public void setSp_id(int sp_id) {
		this.sp_id = sp_id;
	}
	public String getSp_title() {
		return sp_title;
	}
	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}
	public int getSp_cat1() {
		return sp_cat1;
	}
	public void setSp_cat1(int sp_cat1) {
		this.sp_cat1 = sp_cat1;
	}
	public int getSp_cat2() {
		return sp_cat2;
	}
	public void setSp_cat2(int sp_cat2) {
		this.sp_cat2 = sp_cat2;
	}
	public String getSp_img_url() {
		return sp_img_url;
	}
	public void setSp_img_url(String sp_img_url) {
		this.sp_img_url = sp_img_url;
	}
	public String getSp_vidio_url() {
		return sp_vidio_url;
	}
	public void setSp_vidio_url(String sp_vidio_url) {
		this.sp_vidio_url = sp_vidio_url;
	}
	public int getSp_price() {
		return sp_price;
	}
	public void setSp_price(int sp_price) {
		this.sp_price = sp_price;
	}
	@Override
	public String toString() {
		return "Shangpin [sp_id=" + sp_id + ", sp_title=" + sp_title + ", sp_cat1=" + sp_cat1 + ", sp_cat2=" + sp_cat2
				+ ", sp_img_url=" + sp_img_url + ", sp_vidio_url=" + sp_vidio_url + ", sp_price=" + sp_price + "]";
	}

	
	
}
