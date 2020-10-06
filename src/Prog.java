import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите слово");
        String s = scan.nextLine();
        System.out.println(chek(s));
    }
    public static String chek (String c){
        String b ="";
        for(int i=c.length()-1 ; i>=0 ; i--) {
            char m=c.charAt(i);
            b+=m;
        }
        if(b.equals(c) ) {
            return "слово палина";
        }
        return "слово не палина";
    }
}