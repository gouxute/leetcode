/**
 * Created by mtz on 2015/11/6.
 */
public class CountPrimesAdvance {
    public int countPrimes(int n){
        boolean[] isPrime = new boolean[n];
        for(int i = 2;i<=n-1;i++)
            isPrime[i] = true;
        for(int i = 2;i*i<=n;i++) {
            if (!isPrime[i])
                continue;
            for(int j = i*i;j <= n;j=j+i)
                isPrime[j] = false;
        }
        int count = 0;
        for(int i = 0; i <= n-1;i++)
            if(isPrime[i]==true)
                count++;
        return count;
    }

    public static void main(String args[]){
        CountPrimesAdvance a = new CountPrimesAdvance();
        System.out.println(a.countPrimes(11));

    }

}
