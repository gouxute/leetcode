package Encrypt;

/**
 * Created by Administrator on 2015-06-01.
 */
public class encrypt {
    int M1 = 10000000;
    int IA1 = 20000000;
    int IC1 = 30000000;
    public void encrpt1(int key, char[] buffer, int size){
        int idx = 0;
        if(key == 0)
            key=1;
        int mkey = M1;
        if(mkey ==0)
            mkey=1;
        while (idx<size){
            /*key = IA1 * (key%mkey) + IC1;
            int t = ((key>>20)&0xff) ;
            int t1 =buffer[idx] ^t;
            buffer[idx] = (char) t1;
            idx++;
            */
            key = IA1 * ( key % mkey ) + IC1;
            buffer[idx++] ^= (char)((key>>20) & 0xFF);
        }
    }
    public static void main(String [] args) {
        encrypt t = new encrypt();
        char[] buffer = new char[]{

                '2', 's', 's', 's', 's', 's', 's'
               };
        String test = "0xB2E2413132333435000000000000000000000000000294010000005C020008000000005417F95D00007EC8000000005417FA8901D5C5CDF500000000000000000000000031353130303132303031330000000000000000007A68616E6777616E6740676D61696C2E636F6D00000000000000000000000000";
        buffer = test.toCharArray();
        for (int i = 0; i <= 3; i++) {
            t.encrpt1(0xff, buffer, buffer.length);
            System.out.println(buffer);
        }
        System.out.println(Integer.parseInt(test,16));
    }
}
