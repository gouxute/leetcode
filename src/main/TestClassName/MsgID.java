import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2015-05-31.
 */
public class MsgID {
    public MsgID(){}

    static int a1=0;
    static int[] msgid = new int []{0x1001, 0x1002, 0x1003, 0x1004, 0x1005, 0x1006, 0x1007, 0x1008, 0x9001, 0x9002,
                    0x9003, 0x9004, 0x9005, 0x9006, 0x9007, 0x9008, 0x9101, 0x1200, 0x9200, 0x1300,
                    0x9300, 0x1400, 0x9400, 0x1500, 0x9500, 0x1600, 0x9600, 0x1201, 0x1202, 0x1203, 0x1206,
                    0x1207, 0x1208, 0x1209, 0x120A, 0x120B, 0x120C, 0x120D, 0x9202, 0x9203, 0x9204, 0x9205,
                    0x9206, 0x9207, 0x9208, 0x9209, 0x920A, 0x920B, 0x1301, 0x1302, 0x9301, 0x9302, 0x1401,
                    0x1402, 0x1403, 0x9401, 0x9402, 0x9403, 0x1501, 0x1502, 0x1503, 0x1504, 0x1505, 0x9501,
                    0x9502, 0x9503, 0x9504, 0x9505, 0x1601, 0x9601};

    public static void main(String args[]) {
        for(int i=0;i<= MsgID.msgid.length-1;i++)
            System.out.println(MsgID.msgid[i]);
        System.out.println(MsgID.a1);
    }
}
