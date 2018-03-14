package hms.tecktalks.kotlinvsjava.java;

public class NullCheck {

    public static void main(String [] args){
        String name = "Harry Potter";
        System.out.println(formatName(name));
        System.out.println(formatName(null));
    }

    public static String formatName(String name){
        if(name != null) {
            return name.toUpperCase();
        } else {
            return "";
        }
    }
}
