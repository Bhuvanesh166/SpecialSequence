import java.util.Scanner;
public class SpecialSequence{
    public static int findSequence(String string){
        int acount=0;
        int result=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='A' ){
                acount++;
            }
            if(string.charAt(i)=='G'){
                result+=acount;
            }
        }
        return result;
    }
    public static void main(String arg[]){
        Scanner scanner =new Scanner (System.in);
        String string=scanner.next();
        System.out.print(findSequence(string));
    }
}