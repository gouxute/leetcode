/**
 * Created by mtz on 2015/11/12.
 */
public class m {

    public static void main(String args[]){
        ProductA A = new ProductA();
        ProductA1 A1 = new ProductA1(3,100);
        A.setIndex(2);
        A.setnumOfOpe(10);

        System.out.println("A.getIndex() " + A.getIndex() + "    A.getnumOfOpe() " + A.getnumOfOpe());
        System.out.println("A1.getIndex() " +A1.getIndex()+"    A1.getnumOfOpe() " + A1.getnumOfOpe());
        System.out.println("The two cost is  " + A.getCost()+"  "+ A1.getCost());


    }
}
