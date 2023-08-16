import java.util.Scanner;
public class StrOperations {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str="hai am @ 2 platform";
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
            System.out.println(str.isBlank());
            System.out.println(str.isEmpty());
            System.out.println(str.charAt(4));
            System.out.println(str.endsWith("m"));

        }
    }


