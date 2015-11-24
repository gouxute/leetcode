/**
 * Created by Administrator on 2015-05-30.
 */
public class shift {

    public void doShift( ){
        int a ,bit;
        a= 0xff00;
        a = a<<8;
        a = a &0xff00;
        System.out.print(Integer.toHexString(a));
    }
    public static void main(String [] args){
        shift s = new shift();
        s.doShift();
    }




}
