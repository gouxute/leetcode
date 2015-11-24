/**
 * Created by mtz on 2015/11/12.
 */
public class ProductA1 extends ProductA {
    public ProductA1(int pIndex, int numOfOpe){
        this.pIndex = pIndex;
        this.numOfOpe = numOfOpe;
    }

    public int getCost(){
        return this.pIndex * this.numOfOpe * this.numOfOpe;
    }

}
