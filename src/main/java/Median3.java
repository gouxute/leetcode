/**
 * Created by Administrator on 2015-05-22.
 */
public class Median3 {

    public double findNumber(int []a, int b[], int number) {
        // divide number into two parts
        if (a.length > b.length)
            return findNumber(b, a, number);
        if(a.length == 0)
            return b[number-1];
        if (number == 1){
           return Math.min(a[0], b[0]);
        }
        int counta = Math.min(number/2, a.length);
        int countb = number - counta;
        if(a[counta-1]>b[countb-1]){
            int []temp = new int[b.length - countb];
            for(int i=0 ; i<=b.length - countb-1;i++)
                temp[i] = b[countb + i];
            return findNumber(a,temp,number - countb);
        }
        if(a[counta-1]<b[countb-1]){
            int []temp = new int[a.length - counta];
            for(int i=0 ; i<=a.length - counta-1;i++)
                temp[i] = a[counta + i];
            return findNumber(temp,b,number - counta);
        }
        else if(a[counta-1] == b[countb-1])
            return a[counta-1];
        return  0;
    }
    public double findMedianSortedArrays(int [] a , int [] b){
        double result = 0;
        double t1,t2;

        if((a.length + b.length)%2 ==0){
            t1 = findNumber(a,b,(a.length+b.length)/2);
            t2 = findNumber(a,b,(a.length+b.length)/2+1);
            return (t1+t2)/2;
        }
        else
            return findNumber(a,b,(a.length+b.length+1)/2);
    }


    public static void main(String []args){
        int a[] = {};
        int b[] = {1};
        Median3 test = new Median3();
        System.out.println(test.findMedianSortedArrays(a,b));

    }
}
