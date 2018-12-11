package rong.tools;

import java.util.Scanner;
import rong.main.goodsPage;
import rong.main.mainPage;

public final class inputContent {

	// Scanner�� ��ȡ���룻 �����ַ��� String
	public static String ScannerInfoString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����룺");
		return scanner.next();
	}

	// Scanner�� ��ȡ���룻 ���̻�ȡ��Ʒ�۸�,С�������λ double
	public static double ScannerInfoDouble() {
		double price = 0.00;
		Scanner scanner = new Scanner(System.in);
		System.out.print("����С�������λ,�����룺");
		String info = scanner.next(); // ��ȡ�����Կո����   nextLine()�Իس�������
		String regex = "(([1-9][0-9]*)\\.([0-9]{2}))|[0]\\.([0-9]{2})";// ����С�����2λС��
		while (true) {
			if (info.matches(regex)) {
				price = Double.parseDouble(info);
				break;
			} else {
				System.out.println("�������󣡣�\n");
				continue;
			}
		}
		return price;
	}

	// Scanner�� ��ȡ���룻 ��������  int
	public static int ScannerInfoNum() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����룺");
		String info = scanner.next();
		String regex = "([1-9])|([1-9][0-9]+)";//��Ʒ����
		while(true) {
			if (info.matches(regex)) {
				num = Integer.parseInt(info);
				break;
			} else {
				System.out.println("�������󣡣�\n");
				continue;
			}
		}
		return num;
	}
	/**
	 * ��ȡ�û�-��������Ʒ-��һ��
	 * ��ȡ�û�-ɾ������Ʒ-��һ��
	 * ��ȡ�û�-�������Ʒ-��һ��
	 * @param ������
	 */
	public static void changedInfoNext(String oper) {
		
		while(true) {
			System.out.println("\n\t �Ƿ������ǰ������:(Y/N)");
			String choice = ScannerInfoString();
			if ("y".equals(choice) || "Y".equals(choice)) {
				if ("addGoods".equals(oper)) {
					goodsPage.addGoodsPage();
				}
			} else if("N".equals(choice) || "n".equals(choice)) {
				mainPage.maintentenancePage();
			}
			System.out.println("\n �������󣡣����������룡��");
		}
		
	}
}