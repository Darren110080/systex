package com.systex.main;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("請輸入需要幾組號碼:");      
        String inputGroupNumber = scanner.nextLine();       //請執行者輸入需要幾組號碼
        int newInputGroupNumber = Integer.parseInt(inputGroupNumber);
       
        System.out.println("確認需要"+inputGroupNumber+"組號碼");
        System.out.println("請輸入需要排除的數字，並以空格隔開:");

        String inputLine = scanner.nextLine();          //請執行者輸入需要排除的數字

        Set<Integer> SetExcludeNumber = new HashSet<>();            //創建Set，存排除的數字
       
        String[] numbers = inputLine.split(" ");           //空格分割數字

        for (String numberStr : numbers) {                    //將字串轉整數
            try {

                int number = Integer.parseInt(numberStr);

                SetExcludeNumber.add(number);                    //加入排除的Set
            } catch (NumberFormatException e) {                    //提醒用戶輸入無效格式，例如多一個空格
                System.out.println("數字因為空格或輸入錯誤 無法讀取: " + numberStr);
            }
        }
        

        Random random = new Random();
        Set<Integer> selectNumber = new TreeSet<>();             //用TreeSet由大到小排序，且不重複
        
    
		for(int i=1;i<=newInputGroupNumber;i++) {                //根據用戶輸入的組數迴圈
        	selectNumber.clear();                             //清空TreeSet
        while(selectNumber.size()<6) {                                   //在SelectNumber總數小於6的時候持續迴圈
        	int newNumber = random.nextInt(49)+1;                   //產生1~49的隨機數，+1是為了避免0的產生
            if (SetExcludeNumber.contains(newNumber)) {               //若產生的隨機數包含在SetExcludeNumber內就繼續迴圈
            	continue;
            }
            else if(selectNumber.add(newNumber)== false) {             //若TreeSet加入重複的數，產生False也繼續迴圈
            	continue;
            }
            
            else {
            	selectNumber.add(newNumber);                  //沒有產生以上錯誤，就加入TreeSet
            	
            }
        }
        
        System.out.println("推薦的第"+i+"組數字: " + selectNumber);                      //印出TreeSet
        }
        
        
        scanner.close();

	}

}
