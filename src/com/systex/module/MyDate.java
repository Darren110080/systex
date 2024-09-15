package com.systex.module;

import java.util.Objects;

public class MyDate {
		
	
	
	   private int day;
	   public MyDate() {
		super();
	}
	

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int month;
	   @Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
		@Override
		public int hashCode() {
			return Objects.hash(day, month, year);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyDate other = (MyDate) obj;
			return day == other.day && month == other.month && year == other.year;
		}
		private int year;
		
		
		
		public int compareTo(MyDate o) {
			// TODO Auto-generated method stub
			if(this.year > o.year) {
			return 1;
			}else if (this.year < o.year) {
				
				return -1;
			}else {
				return 0;
			}
		}
	
		
}