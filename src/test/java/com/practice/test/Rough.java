package com.practice.test;

import org.testng.annotations.*;


public class Rough {

    @Parameters({"a","b","c"})
    @Test()
    public void getDataFromParameters(String a, String b, String c) {
        System.out.println(a+"....."+b+"......"+c);

    }
    @Test(dataProvider="getData", groups="functional")
    public void ourFunc(String a, String b, String c) {
        System.out.println(a+"....."+b+"......"+c);

    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[2][3];
        data[0][0]="a";
        data[0][1]="a1";
        data[0][2]="a2";


        data[1][0]="b";
        data[1][1]="b1";
        data[1][2]="b2";
        return data;

    }
}