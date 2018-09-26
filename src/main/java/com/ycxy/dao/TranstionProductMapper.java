package com.ycxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ycxy.model.ProUser;
import com.ycxy.model.Product;
import com.ycxy.model.TranstionProduct;

public interface TranstionProductMapper {

	/**
	 * ������Ʒidȡ�ø���Ʒ
	 * 
	 * @param tpUserid
	 * @return
	 */
	TranstionProduct queryTranstionProductsByid(String id);

	/**
	 * ȡ��������Ʒ
	 * 
	 * @return
	 */
	List<TranstionProduct> queryTranstionProducts();

	/**
	 * �����û�idȡ���������ڸ��û�����Ʒ
	 * 
	 * @param tpUserid
	 * @return
	 */
	List<TranstionProduct> queryTranstionProductsBytpUserid(@Param("tpuserid") String tpuserid);

	/**
	 * ����idȡ�ø��û���Ϣ
	 * 
	 * @param id
	 * @return
	 */
	ProUser queryProUser(String id);

	/**
	 * ���ֿ��е���Ʒ��������Ʒչʾҳ��
	 * 
	 * @return
	 */
	int insertTranstionProduct(@Param("proName") String proName, @Param("proSellprice") String proSellprice,
			@Param("proCostprice") String proCostprice, @Param("proCondition") String proCondition,
			@Param("proPicsrc") String proPicsrc, @Param("proUserid") String proUserid);
}
