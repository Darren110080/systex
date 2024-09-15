package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.systex.module.DateComparator;
import com.systex.module.MyDate;




public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        //請用戶輸入需要幾組號碼
        System.out.println("升冪排序，請輸入1，降冪排序，請輸入2");
        String howToSort = scanner.nextLine();       //請用戶輸入需要Descend或ascend
        int newHowToSort = Integer.parseInt(howToSort);
        
        
				LinkedList<MyDate> dates = new LinkedList<>();
				dates.add(new MyDate(13,7,2024));
				dates.add(new MyDate(12,9,2024));
				dates.add(new MyDate(14,8,2024));
				dates.add(new MyDate(5,6,2024));
				dates.add(new MyDate(25,1,2024));
				dates.add(new MyDate(23,1,2024));
				dates.add(new MyDate(25,2,2023));
				dates.add(new MyDate(24,1,2024));
				dates.add(new MyDate(24,1,2023));
				
				
				
				System.out.println("===========Not Yet Sorted============");
		        dates.forEach(d -> System.out.println(d));
		        if(newHowToSort == 2) {
		        System.out.println("===========Desended By Year, Month, and Day============");
		        Collections.sort(dates, new DateComparator().reversed());
		        dates.forEach(d -> System.out.println(d));
		        };
		        
		        if(newHowToSort == 1) {
		        System.out.println("===========Assended By Year, Month, and Day============");
		        Collections.sort(dates, new DateComparator());
		        dates.forEach(d -> System.out.println(d));
		        }
		        
		        
		   scanner.close();
	}
	
	
	
	
	
	

}
