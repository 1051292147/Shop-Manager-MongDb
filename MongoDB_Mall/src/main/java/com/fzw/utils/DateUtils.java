package com.fzw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //日期转换成字符串
    public static String DateToString(Date date,String pattern){
        SimpleDateFormat sdf=new SimpleDateFormat();
        pattern=sdf.format(date);
        return pattern;
    }
    //字符串转换成日期
    public static Date StringToDate(String pattern,String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(date);
        Date da=sdf.parse(pattern);
        return da;
    }
}
