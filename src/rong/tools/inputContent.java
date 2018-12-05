package rong.tools;

import java.util.Scanner;

public final class inputContent{
	
	// Scanner类 获取输入；
	public static String ScannerInfoString() {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		return scanner.next();		
	}
}