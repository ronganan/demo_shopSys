package rong.tools;

import java.util.Scanner;
import rong.main.goodsPage;
import rong.main.mainPage;

public final class inputContent {

	// Scanner类 获取输入； 返回字符串 String
	public static String ScannerInfoString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		return scanner.next();
	}

	// Scanner类 获取输入； 键盘获取商品价格,小数点后两位 double
	public static double ScannerInfoDouble() {
		double price = 0.00;
		Scanner scanner = new Scanner(System.in);
		System.out.print("保留小数点后两位,请输入：");
		String info = scanner.next(); // 获取输入以空格结束   nextLine()以回车结束；
		String regex = "(([1-9][0-9]*)\\.([0-9]{2}))|[0]\\.([0-9]{2})";// 保留小数点后2位小数
		while (true) {
			if (info.matches(regex)) {
				price = Double.parseDouble(info);
				break;
			} else {
				System.out.println("输入有误！！\n");
				continue;
			}
		}
		return price;
	}

	// Scanner类 获取输入； 返回数字  int
	public static int ScannerInfoNum() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		String info = scanner.next();
		String regex = "([1-9])|([1-9][0-9]+)";//商品数量
		while(true) {
			if (info.matches(regex)) {
				num = Integer.parseInt(info);
				break;
			} else {
				System.out.println("输入有误！！\n");
				continue;
			}
		}
		return num;
	}
	/**
	 * 获取用户-更改完商品-下一步
	 * 获取用户-删除完商品-下一步
	 * 获取用户-添加完商品-下一步
	 * @param 调用者
	 */
	public static void changedInfoNext(String oper) {
		
		while(true) {
			System.out.println("\n\t 是否继续当前操作！:(Y/N)");
			String choice = ScannerInfoString();
			if ("y".equals(choice) || "Y".equals(choice)) {
				if ("addGoods".equals(oper)) {
					goodsPage.addGoodsPage();
				}
			} else if("N".equals(choice) || "n".equals(choice)) {
				mainPage.maintentenancePage();
			}
			System.out.println("\n 输入有误！！请重新输入！！");
		}
		
	}
}