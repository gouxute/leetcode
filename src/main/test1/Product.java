/**
 * Created by mtz on 2015/11/12.
 */
public class Product {
    int pIndex;
    int numOfOpe;
    void setIndex(int i){
        pIndex = i;
    }
    int getIndex(){
        return pIndex;
    }
    void setnumOfOpe(int i){
        numOfOpe = i;
    }

    int getnumOfOpe(){
        return numOfOpe;
    }

    int getCost(){
        return pIndex*numOfOpe;
    }
}
