package JAVA_BASIC.CONTROL_STATEMENTS;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {"Java","C++","C","Python","Js"};
        System.out.println("Printing the context of array names");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
