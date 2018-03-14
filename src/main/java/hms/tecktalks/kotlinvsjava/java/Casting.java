package hms.tecktalks.kotlinvsjava.java;

public class Casting {
    public static void main(String[] args) {
        Object strObj = "Hello Castring";

        if (strObj instanceof String) {
            String str = (String) strObj;
            System.out.println(str);
        }
    }
}
