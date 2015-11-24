/**
 * Created by mtz on 2015/11/19.
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Man m = new Man(1.85,80);
        Woman w = new Woman(1.60,45);

        System.out.println("Sex:"+m.getSex()+" BMI:"+m.BMI+" Message:"+m.popMessage());
        System.out.println("Sex:"+w.getSex()+" BMI:"+w.BMI+" Message:"+w.popMessage());

    }

}
