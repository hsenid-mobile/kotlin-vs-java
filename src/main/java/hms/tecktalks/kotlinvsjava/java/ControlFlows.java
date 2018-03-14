package hms.tecktalks.kotlinvsjava.java;

public class ControlFlows {

    public static void main(String[] args) {
        int max = getMax(40, 50);
        System.out.println("Max : " + max);

        int intVal = getIntVal("One");
        System.out.println("Int val: " + intVal);
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static int getIntVal(String name) {
        switch (name) {
            case "One":
                return 1;
            case "Two":
                return 2;
            default:
                return 0;
        }
    }
}
