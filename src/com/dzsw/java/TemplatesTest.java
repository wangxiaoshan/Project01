package com.dzsw.java;

import com.dzsw.bean.Customer;

import java.util.ArrayList;

/**
 * @author wangxs
 * @createDate 2019-09-27 14:06
 */
public class TemplatesTest {
    //模板六： prsf : 可生成 private static final
     private static final Customer CUST = new Customer();
    //变形 psf
    public static final int NUM = 1;
    // 变形 psfi
    public static final int NUM2 = 2;
    //变形 psfs
    public static final String  S = "ddd";

    // psvm
    public static void main(String[] args) {
        TemplatesTest tm = new TemplatesTest();
        tm.y();
         //sout
        System.out.println();
        System.out.println();
        // soutp /soutm /soutv /xxx.sout
        //soutp 打印参数
        System.out.println("args = [" + args + "]");
        //soutm 类加方法
        System.out.println("TemplatesTest.main");
        int num = 10;
        int num1 = 20;
        //soutv 打印变量
        System.out.println("num = " + num);
        System.out.println("num1 = " + num1);

    }
    public  void t(){
        System.out.println("TemplatesTest.t");
    }
    public  void  s(){
        System.out.println("TemplatesTest.s");
    }
    public  void x(int  i){
        System.out.println("i = [" + i + "]");
        System.out.println("TemplatesTest.x");
        System.out.println("i = " + i);
        System.out.println();
    }
    public  void y (){
        String[] arr = new String[]{"Tom","meim"};
        //模板三：fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板4：list.for
        ArrayList list  = new ArrayList();
        list.add(123);
        list.add(777);
        list.add(000);
        for (Object o : list) {
            System.out.println("o = " + o);
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
       //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //模板五：ifn
        ArrayList list1  = new ArrayList();
        list1.add(123);
        list1.add(777);
        list1.add(000);
        if (list1 == null) {
            System.out.println("null = " + null);
        }
        //变形：inn
        if (list1 != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list1 != null) {

        }
        if (list1 == null) {

        }
    }
}
