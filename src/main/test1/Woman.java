/**
 * Created by mtz on 2015/11/19.
 */
public class Woman extends Human{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public Woman(double h, int w)
    {
        this.sex = "Woman";
        this.height = h;
        this.weight = w;
        this.setBMI(h, w);
    }
    public String popMessage()
    {
        if(this.getBMI()>25)
        {
            return "Warning!";
        }
        else
            return "Good!";
    }

}
