package com.ycxy.model;

/**
 * �����׵���Ʒ�� ����ʾ����ҳ�桰ʲô����������
 * 
 * @author ASUS
 *
 */
public class TranstionProduct {

	// ��Ʒid
	private String id;
	// ��Ʒ ����
	private String tpName;
	// ��Ʒ ת����
	private String tpSellprice;
	// ��Ʒ ԭ��
	private String tpCostprice;
	// ��Ʒ ��ɫ
	private String tpCondition;
	// ��Ʒ ͼƬ·��
	private String tpPicsrc;
	// �û�id����Ӧprouser���е�id��
	private String tpUserid;

	// ����ѯʱʹ��
	private ProUser proUser;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTpName() {
		return tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

	public String getTpSellprice() {
		return tpSellprice;
	}

	public void setTpSellprice(String tpSellprice) {
		this.tpSellprice = tpSellprice;
	}

	public String getTpCostprice() {
		return tpCostprice;
	}

	public void setTpCostprice(String tpCostprice) {
		this.tpCostprice = tpCostprice;
	}

	public String getTpCondition() {
		return tpCondition;
	}

	public void setTpCondition(String tpCondition) {
		this.tpCondition = tpCondition;
	}

	public String getTpPicsrc() {
		return tpPicsrc;
	}

	public void setTpPicsrc(String tpPicsrc) {
		this.tpPicsrc = tpPicsrc;
	}

	public String getTpuserid() {
		return tpUserid;
	}

	public void setTpuserid(String tpUserid) {
		this.tpUserid = tpUserid;
	}

	public ProUser getProUser() {
		return proUser;
	}

	public void setProUser(ProUser proUser) {
		this.proUser = proUser;
	}

	@Override
	public String toString() {
		return "TranstionProduct [id=" + id + ", tpName=" + tpName + ", tpSellprice=" + tpSellprice + ", tpCostprice="
				+ tpCostprice + ", tpCondition=" + tpCondition + ", tpPicsrc=" + tpPicsrc + ", tpUserid=" + tpUserid
				+ ", proUser=" + proUser + "]";
	}

}
