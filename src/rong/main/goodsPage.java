package rong.main;

import rong.tools.inputContent;
import rong.main.mainPage;
import rong.main.goodsPage;
import rong.entity.Goods;
import rong.dao.GoodsDao;

public final class goodsPage {
	// �����Ʒ
	public static void addGoodsPage() {
		
		System.out.println("\t����ִ�������Ʒ����\n");
		System.out.println("\n�����������Ʒ-����:");
		String goodsName = inputContent.ScannerInfoString();
		
		System.out.println("\n��������Ʒ�۸�:");
		double goodsPrice = inputContent.ScannerInfoDouble();
		
		System.out.println("\n������������");
		int goodsNum = inputContent.ScannerInfoNum();
		
		Goods goods = new Goods(goodsName, goodsPrice, goodsNum);
		boolean bool = new GoodsDao().addGoods(goods);
		
		if (bool) {
			System.out.println("\n\t �Ѿ��ɹ������Ʒ��");
		} else {
			System.out.println("���ʧ�ܣ���");
		}
		inputContent.changedInfoNext("addGoods");
	}
}