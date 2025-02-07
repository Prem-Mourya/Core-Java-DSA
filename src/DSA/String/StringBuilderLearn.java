package DSA.String;

public class StringBuilderLearn {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(0,'M');
        System.out.println(str);

    }
}
