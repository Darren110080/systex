package com.systex.module;

import java.util.Comparator;

public class DateComparator implements Comparator<MyDate> {
    public int compare(MyDate o1, MyDate o2) {

        if (o1.getYear() != o2.getYear()) {
            return Integer.compare(o1.getYear(), o2.getYear());         //比較年份
        }
        
        if (o1.getMonth() != o2.getMonth()) {
            return Integer.compare(o1.getMonth(), o2.getMonth());       //比較月份
        }
        
        else {
        return Integer.compare(o1.getDay(), o2.getDay());              //比較日期
        }
    }
}
