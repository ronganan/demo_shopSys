package rong.main;

import rong.tools.inputContent;

public final class mainPage {

	public static void main(String[] args) {

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
				}
			}
		}
	}

}
