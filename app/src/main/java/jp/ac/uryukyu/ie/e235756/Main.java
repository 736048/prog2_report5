package jp.ac.uryukyu.ie.e235756;

public class Main {
    public static void main(String[] args){
        String str=null;
        try{
            System.out.println(str.length());
        }catch(java.lang.NullPointerException e){
            System.out.println("java.lang.NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}