import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inp , inp2 ;
        int x= 0;
        int loopSize=0;
        int expo =0;
        long result=0 ;
        int val =0;
        String operation ;

        System.out.print("Enter a hexadecimal number: ");
        Scanner input = new Scanner(System.in);
        inp = input.next();
        x = inp.length();
        loopSize = x ;
        x--;
        do {
            if(inp.charAt(1)== 'x'|| inp.charAt(1)== 'X'){
                inp = inp.substring(2);
                x=x-2;
                loopSize= x+1;}
            if (inp.charAt(x) >=48 && inp.charAt(x) <= 57) {
                val = inp.charAt(x) - 48;
            }
            if (inp.charAt(x)== 'a' || inp.charAt(x)== 'A' ){
                val=10;
            }
            if (inp.charAt(x)== 'b'|| inp.charAt(x)== 'B'){
                val=11;
            }
            if (inp.charAt(x)== 'c'|| inp.charAt(x)== 'C'){
                val=12;
            }
            if (inp.charAt(x)== 'd'|| inp.charAt(x)== 'D'){
                val=13;
            }
            if (inp.charAt(x)== 'e'|| inp.charAt(x)== 'E'){
                val=14;
            }
            if (inp.charAt(x)== 'f'|| inp.charAt(x)== 'F'){
                val=15;
            }
            if (inp.charAt(x) >=48 && inp.charAt(x) <= 57) {
                val = inp.charAt(x) - 48;
            }
            result = result + val*((long) Math.pow( 16 , expo ));
            expo++;
            loopSize--;
            x--;
        }
        while( (x+1)>0);
        System.out.println("Your number is "+ result +" in decimal");
    }
}
