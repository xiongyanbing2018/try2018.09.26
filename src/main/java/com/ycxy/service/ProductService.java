package com.ycxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycxy.dao.ProductMapper;
import com.ycxy.model.Product;
import com.ycxy.model.ProductIndex;

@Service
public class ProductService {

	@Autowired
	private ProductMapper mapper;
	
	/*
	 * ����û�Ҫ������������Ʒ
	 * 
	 */
	public List<Product> queryProducts(String proUserid){
		return mapper.queryProducts(proUserid);
	}
	
	/*
	 * ���������չʾ��������Ʒ
	 */
	public List<ProductIndex> queryProductIndexs(){
		return mapper.queryProductIndexs();
	}
}
