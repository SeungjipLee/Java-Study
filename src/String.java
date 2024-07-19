import java.util.Arrays;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String a = "Hello World";
        java.lang.String b = "hello World";
        java.lang.String c = "Hello World";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println(a.indexOf("ll"));
        System.out.println(a.contains("h"));

        System.out.println(a.replace("l", "i"));

        System.out.println(a.substring(0, 4));

        System.out.println(a.toUpperCase());

        java.lang.String d = "a:b:c:d";
        java.lang.String[] result = d.split(":");

        System.out.println(Arrays.toString(result));

        java.lang.StringBuffer sb = new StringBuffer();
        sb.append("hello");
        System.out.println(sb);
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb);
    }
}
