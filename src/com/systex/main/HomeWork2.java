package com.systex.main;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 創建 Scanner 物件以從控制台讀取輸入
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入數字，數字之間用空格隔開
        System.out.println("請輸入數字，以空格隔開:");

        // 讀取整行輸入
        String inputLine = scanner.nextLine();

        // 分割輸入的數字字符串，根據空格分隔
        String[] numbers = inputLine.split(" ");

        // 將字符串數組轉換為整型數組並顯示
        System.out.println("您輸入的數字是:");
        for (String number : numbers) {
            try {
                // 嘗試將字符串轉換為整數
                int num = Integer.parseInt(number);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("錯誤的數字格式: " + number);
            }
        }

        // 關閉 Scanner
        scanner.close();
    
	}

}
