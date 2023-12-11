package jp.ac.uryukyu.ie.e235716;

public class Ex1{
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println("String length: " + length);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }  
    }
}