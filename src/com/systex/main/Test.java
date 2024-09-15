package com.systex.main;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        //請用戶輸入需要幾組號碼
        System.out.println("請輸入需要幾組號碼:");
        String inputGroup = scanner.nextLine();
        int inputGroup1 = Integer.parseInt(inputGroup);
       
            
        
        // 提示用户输入数字，以空格隔开
        System.out.println("確認需要"+inputGroup+"組號碼");
        System.out.println("請輸入需要排除的數字，並以空格隔開:");

        // 读取整行输入
        String inputLine = scanner.nextLine();

        // 创建一个 Set 用于存储唯一的数字
        Set<Integer> SetA = new HashSet<>();
       
        // 分割输入的数字字符串，按照空格分隔
        String[] numbers = inputLine.split(" ");

        // 遍历每个分隔出的数字
        for (String numberStr : numbers) {
            try {
                // 尝试将字符串转换为整数
                int number = Integer.parseInt(numberStr);
                // 将整数添加到 Set 中
                SetA.add(number);
            } catch (NumberFormatException e) {
                // 捕获并处理 NumberFormatException
                System.out.println("无效的数字格式: " + numberStr);
            }
        }

        Random random = new Random();
        Set<Integer> selectNumber = new TreeSet<>();
        
    
		for(int i=1;i<=inputGroup1;i++) {
        	selectNumber.clear();
        while(selectNumber.size()<6) {
        	int newNumber = random.nextInt(49)+1;  // 產生 1 到 49 之間的隨機數
            if (SetA.contains(newNumber)) {
            	continue;
            }
            else if(selectNumber.add(newNumber)== false) {
            	continue;
            }
            
            else {
            	selectNumber.add(newNumber);
            	
            }
        }
        
        System.out.println("推薦的第"+i+"組數字: " + selectNumber);
        }
        
        
        scanner.close();

	}
}
