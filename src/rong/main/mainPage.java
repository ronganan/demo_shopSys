package rong.main;

import rong.tools.inputContent;
import rong.main.goodsPage;;

public final class mainPage {

	public static void main(String[] args) {

		mainFun();

	}

	public static void mainFun() {
		System.out.println("***************************");
		System.out.println("***************************\n");
		System.out.println("\t 1.商品维护\n");
		System.out.println("\t 2.前台收银\n");
		System.out.println("\t 3.商品管理\n");
		System.out.println("***************************");
		System.out.println("请输入选项，或按0退出系统：");

		while (true) {
			// 在主函数中引用其他类中的方法 需要加上 类名.方法；
			// ScannerInfoString方法：获取输入的内容；
			String choice = inputContent.ScannerInfoString();
			String regex = "[0-3]";
			if (choice.matches(regex)) {
				// 转为数字 后面用switch来分发后续的内容；
				int info = Integer.parseInt(choice);
				switch (info) {
				case 0:
					System.out.println("*******************");
					System.out.println("已经退出系统！！");
					System.exit(0);
					break;
				case 1:
					maintentenancePage();
					break;
				case 2:
					break;
				}
			}
		}
	}

	public static void maintentenancePage() {
		System.out.println("***************************\n");
		System.out.println("\t 1.添加商品\n");
		System.out.println("\t 2.更改商品\n");
		System.out.println("\t 3.删除商品\n");
		System.out.println("\t 4.查询商品\n");
		System.out.println("\t 5.显示所有商品\n");
		System.out.println("***************************");
		System.out.println("\n请输入选项,或者按 0 返回上一级菜单.");

		while (true) {
			String choice = inputContent.ScannerInfoString();
			String regex = "[0-5]";
			if (choice.matches(regex)) {
				int info = Integer.parseInt(choice);
				switch (info) {
				case 0:
					mainFun();
					break;
				case 1:
					goodsPage.addGoodsPage();
					break;
				}
			} else {
				System.out.println("输入有误！请重新输入！！");
			}
		}
	}
}
