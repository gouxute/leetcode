package ArrayList;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015-06-01.
 */
public class array {

    ArrayList<byte[]> field = new ArrayList<byte[]>();
    int []bytenum = new int[]{4,8,8};

    public void divideMsg(){
        byte [] data = {3,23,2};
        byte[] tmp;
        for(int i=0;i<=bytenum.length-1;i++){
                tmp = new byte[bytenum[i]];
            for(int j=0;j<=bytenum[i]-1;j++)
                tmp[i] = 0;
                field.add(tmp);
            }
    }
    public static void main(String [] args) {

        array t = new array();
        t.divideMsg();
        int ss=0;
    }
}
