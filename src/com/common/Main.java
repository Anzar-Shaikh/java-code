package com.common;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");


        String dateFormat = "dd/MM/yyyy HH:mm:ss";
        String dateStr = "01/01/2023 8:43:00";

        Date date = new SimpleDateFormat(dateFormat).parse(dateStr);
        System.out.println(DateUtils.addMinutes(date, 22));
    }
}
