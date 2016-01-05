package xyz.hollysys.search.model;

import java.math.BigDecimal;

/**
 * 商品详情页信息
 * @author sanhao
 *
 */
public class ShangpinDetail {
	private int sp_id;
	private String sp_title;
	private String sp_kuncun;
	private String sp_img_urls;
	private String sp_base_desc;
	private String sp_detail_desc;
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
	public String getSp_kuncun() {
		return sp_kuncun;
	}
	public void setSp_kuncun(String sp_kuncun) {
		this.sp_kuncun = sp_kuncun;
	}
	public String getSp_img_urls() {
		return sp_img_urls;
	}
	public void setSp_img_urls(String sp_img_urls) {
		this.sp_img_urls = sp_img_urls;
	}
	public String getSp_base_desc() {
		return sp_base_desc;
	}
	public void setSp_base_desc(String sp_base_desc) {
		this.sp_base_desc = sp_base_desc;
	}
	public String getSp_detail_desc() {
		return sp_detail_desc;
	}
	public void setSp_detail_desc(String sp_detail_desc) {
		this.sp_detail_desc = sp_detail_desc;
	}
	@Override
	public String toString() {
		return "ShangpinDetail [sp_id=" + sp_id + ", sp_title=" + sp_title + ", sp_kuncun=" + sp_kuncun
				+ ", sp_img_urls=" + sp_img_urls + ", sp_base_desc=" + sp_base_desc + ", sp_detail_desc="
				+ sp_detail_desc + "]";
	}
	
	
	
}
