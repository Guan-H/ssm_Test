package com.gzcss.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateUtils {

    //时间转字符串
    public static String DateToDate(Date date,String pattern){
        SimpleDateFormat sd = new SimpleDateFormat(pattern);
        String format = sd.format(date);

        return format;
    }

    //字符串转时间
    public static Date StringToDate(String time,String pattern) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat(pattern);
        Date parse = sd.parse(time);
        return  parse;
    }


}
