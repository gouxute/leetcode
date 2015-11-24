
/**
 * Created by mtz on 2015/11/6.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i=3; i<=n;i++)
            if (IsPrime(i))
                count++;
        return count;

    }

    public boolean IsPrime(int n){
        boolean t = true;
        for(int i=2; i<=Math.sqrt(n);i++)
            if(Math.abs(n / i - ((double) n) / ((double) i))<= 0.001) {
                t = false;
                break;
            }
        return t;
    }

    public static void main(String args[]){
        CountPrimes a = new CountPrimes();
        System.out.println(a.countPrimes(11));

    }

}
