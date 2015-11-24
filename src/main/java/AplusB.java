/**
 * Created by mtz on 2015/9/29.
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class AplusB {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s = scan.nextLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            System.out.println(a+b);
        }
    }
}
