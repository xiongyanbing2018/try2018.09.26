package com.ycxy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ycxy.model.Product;
import com.ycxy.model.ProductIndex;
import com.ycxy.model.TranstionProduct;
import com.ycxy.service.ProductService;
import com.ycxy.service.TranstionProductService;

@Controller
public class ProductC {

	@Autowired
	private ProductService service;

	@Autowired
	private TranstionProductService service2;

	/*
	 * ��ת���û��������
	 */
	@RequestMapping("/dishomepage.do")
	public ModelAndView DisHomepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index");
		return mv;
	}

	/*
	 * ��ʾ�û�����������ҳ����
	 */
	@RequestMapping("/dishomepageContent.do")
	public ModelAndView DisHomepageContent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index-content");
		return mv;
	}

	/*
	 * ��ʾ�û�Ҫ��������Ʒ�б�
	 */
	@RequestMapping("/queryProducts.do")
	public ModelAndView queryProducts(@RequestParam(name = "proUserid") String proUserid) {
		List<Product> products = service.queryProducts(proUserid);
		System.out.println("products=" + products);
		ModelAndView mv = new ModelAndView();
		mv.addObject("products", products);
		mv.setViewName("/product-list");
		return mv;
	}

	/*
	 * ��ת����Ʒչʾ���棨�����棩 ȡ���û���������Ʒչʾ�������棨�����桰ʲô���������棩
	 */
	@RequestMapping("/getProductIndex.do")
	public ModelAndView getProductIndex() {
		List<ProductIndex> productIndexs = service.queryProductIndexs();
		List<TranstionProduct> transtionProducts = service2.queryTranstionProducts();
		//System.out.println("productIndexs=" + productIndexs);
		//System.out.println("transtionProducts=" + transtionProducts);
		ModelAndView mv = new ModelAndView();
		mv.addObject("productIndexs", productIndexs);
		mv.addObject("transtionProducts", transtionProducts);
		mv.setViewName("/product-index");
		return mv;
	}

	/**
	 * ȡ���û���������Ʒչʾ�������棨�����桰ʲô���������棩
	 * 
	 * @return
	 * 
	 * 		@RequestMapping("/getProductIndex.do") public ModelAndView
	 *         getProductUserPage() { List<TranstionProduct> transtionProducts =
	 *         service2.queryTranstionProducts(); ModelAndView mv = new
	 *         ModelAndView(); mv.addObject("transtionProducts", transtionProducts);
	 *         mv.setViewName("/product-index"); return mv; }
	 */
	/**
	 * ������Ʒid���õ���Ʒ����ҳ
	 * 
	 * @param tpUserid
	 * @return
	 */
	@RequestMapping("/getPurchase.do")
	public ModelAndView getProductDetailPage1(String id) {
		TranstionProduct productsByid = service2.queryTranstionProductsByid(id);
		// System.out.println("productsByid="+productsByid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("productsByid", productsByid);
		mv.setViewName("/purchase");
		return mv;
	}

	/**
	 * �����û�id��ȡ�����ڸ��û�����Ʒ
	 * 
	 * @param tpUserid
	 * @return
	 */
	@RequestMapping("/getUserListProducts.do")
	public ModelAndView getUserListProducts(@RequestParam(name = "tpuserid") String tpuserid) {
		System.out.println("tpUserid=" + tpuserid);
		List<TranstionProduct> productsBytpUserids = service2.queryTranstionProductsBytpUserid(tpuserid);
		//System.out.println("productsBytpUserids=" + productsBytpUserids);
		ModelAndView mv = new ModelAndView();
		mv.addObject("productsBytpUserids", productsBytpUserids);
		mv.setViewName("/repository-products");
		return mv;
	}

	/**
	 * ���ֿ��е���Ʒ��������Ʒչʾҳ��
	 * 
	 * @param proName
	 * @param proSellprice
	 * @param proCostprice
	 * @param proCondition
	 * @param proPicsrc
	 * @param proUserid
	 * @return
	 * 
	 * 		@RequestMapping("/insertTranstionProduct.do") public ModelAndView
	 *         insertTranstionProduct(@RequestParam(name = "proName") String
	 *         proName,
	 * @throws IOException
	 * @RequestParam(name = "proSellprice") String proSellprice,
	 * @RequestParam(name = "proCostprice") String proCostprice,
	 * @RequestParam(name = "proCondition") String proCondition,
	 * @RequestParam(name = "proPicsrc") String proPicsrc, @RequestParam(name =
	 *                    "proUserid") String proUserid) { int result =
	 *                    service2.insertTranstionProduct(proName, proSellprice,
	 *                    proCostprice, proCondition, proPicsrc, proUserid);
	 *                    ModelAndView mv = new ModelAndView(); if (result > 0) {
	 *                    mv.setViewName("/product-index"); } else {
	 *                    mv.setViewName("/fail"); } return mv; }
	 */

	/**
	 * ���ֿ��е���Ʒ��������Ʒչʾҳ��
	 * 
	 * @param proName
	 * @param proSellprice
	 * @param proCostprice
	 * @param proCondition
	 * @param proPicsrc
	 * @param proUserid
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertTranstionProduct.do", method = RequestMethod.POST)
	public void insertTranstionProduct(@RequestParam(name = "proName") String proName,
			@RequestParam(name = "proSellprice") String proSellprice,
			@RequestParam(name = "proCostprice") String proCostprice,
			@RequestParam(name = "proCondition") String proCondition,
			@RequestParam(name = "proPicsrc") String proPicsrc, @RequestParam(name = "proUserid") String proUserid,
			HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("proName="+proName+" proSellprice="+proSellprice);
		int result = service2.insertTranstionProduct(proName, proSellprice, proCostprice, proCondition, proPicsrc,
				proUserid);
		StringBuilder json = new StringBuilder();
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if (result > 0) {
			json.append("{\"success\":true}");
		} else {
			json.append("{\"success\":false}");
		}
		out.print(json);
	}
}
