package com.ebay.cascading;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: tenglinxiao
 * Date: 2/20/14
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String args[])
    {
        SimpleDateFormat formater = new SimpleDateFormat("SS");
        System.out.println(formater.format(new Date()));
        System.out.println(String.format("helloworld, %s", "james"));
    }
}
