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
		System.out.println("\t 1.��Ʒά��\n");
		System.out.println("\t 2.ǰ̨����\n");
		System.out.println("\t 3.��Ʒ����\n");
		System.out.println("***************************");
		System.out.println("������ѡ���0�˳�ϵͳ��");

		while (true) {
			// ���������������������еķ��� ��Ҫ���� ����.������
			// ScannerInfoString��������ȡ��������ݣ�
			String choice = inputContent.ScannerInfoString();
			String regex = "[0-3]";
			if (choice.matches(regex)) {
				// תΪ���� ������switch���ַ����������ݣ�
				int info = Integer.parseInt(choice);
				switch (info) {
				case 0:
					System.out.println("*******************");
					System.out.println("�Ѿ��˳�ϵͳ����");
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
		System.out.println("\t 1.�����Ʒ\n");
		System.out.println("\t 2.������Ʒ\n");
		System.out.println("\t 3.ɾ����Ʒ\n");
		System.out.println("\t 4.��ѯ��Ʒ\n");
		System.out.println("\t 5.��ʾ������Ʒ\n");
		System.out.println("***************************");
		System.out.println("\n������ѡ��,���߰� 0 ������һ���˵�.");

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
				System.out.println("�����������������룡��");
			}
		}
	}
}
