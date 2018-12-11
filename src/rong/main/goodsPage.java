package rong.main;

import rong.tools.inputContent;
import rong.main.mainPage;
import rong.main.goodsPage;
import rong.entity.Goods;
import rong.dao.GoodsDao;

public final class goodsPage {
	// 添加商品
	public static void addGoodsPage() {
		
		System.out.println("\t正在执行添加商品操作\n");
		System.out.println("\n请输入添加商品-名称:");
		String goodsName = inputContent.ScannerInfoString();
		
		System.out.println("\n请输入商品价格:");
		double goodsPrice = inputContent.ScannerInfoDouble();
		
		System.out.println("\n请输入数量：");
		int goodsNum = inputContent.ScannerInfoNum();
		
		Goods goods = new Goods(goodsName, goodsPrice, goodsNum);
		boolean bool = new GoodsDao().addGoods(goods);
		
		if (bool) {
			System.out.println("\n\t 已经成功添加商品！");
		} else {
			System.out.println("添加失败！！");
		}
		inputContent.changedInfoNext("addGoods");
	}
}