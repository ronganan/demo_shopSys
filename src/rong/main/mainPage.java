package rong.main;

import rong.tools.inputContent;

public final class mainPage {

	public static void main(String[] args) {

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
				}
			}
		}
	}

}
