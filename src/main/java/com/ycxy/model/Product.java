package com.ycxy.model;

/**
 * �û�Ҫ��������Ʒ�б� ����������չʾ����Ʒ�� �����������������ʾ��
 * 
 * @author ASUS
 *
 */
public class Product {

	// ��Ʒid
	private String id;
	// ��Ʒ����
	private String proName;
	// ����ʱҪ��ļ�Ǯ(ת����)
	private String proSellprice;
	// �ֽ����Ʒ���г���(ԭ��)
	private String proCostprice;
	// ��Ʒ��ɫ
	private String proCondition;
	// ��Ʒ��ַ
	private String proPicsrc;
	// �û�id
	private String proUserid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProSellprice() {
		return proSellprice;
	}

	public void setProSellprice(String proSellprice) {
		this.proSellprice = proSellprice;
	}

	public String getProCostprice() {
		return proCostprice;
	}

	public void setProCostprice(String proCostprice) {
		this.proCostprice = proCostprice;
	}

	public String getProCondition() {
		return proCondition;
	}

	public void setProCondition(String proCondition) {
		this.proCondition = proCondition;
	}

	public String getProPicsrc() {
		return proPicsrc;
	}

	public void setProPicsrc(String proPicsrc) {
		this.proPicsrc = proPicsrc;
	}

	public String getProUserid() {
		return proUserid;
	}

	public void setProUserid(String proUserid) {
		this.proUserid = proUserid;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", proName=" + proName + ", proSellprice=" + proSellprice + ", proCostprice="
				+ proCostprice + ", proCondition=" + proCondition + ", proPicsrc=" + proPicsrc + ", proUserid="
				+ proUserid + "]";
	}

}
