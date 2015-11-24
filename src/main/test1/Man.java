/**
 * Created by mtz on 2015/11/19.
 */
public class Man extends Human{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public Man(double h, int w)
    {
        this.sex = "Man";
        this.height = h;
        this.weight = w;
        this.setBMI(h, w);
    }
    public String popMessage()
    {
        if(this.getBMI()>30)
        {
            return "Warning!";
        }
        else
            return "Good!";
    }

}
