/**
 * Created by mtz on 2015/11/19.
 */
public abstract class Human {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    protected String sex;
    protected double height;
    protected int weight;
    protected double BMI;
    protected String message;

    protected void setBMI(double h, int w)
    {
        this.BMI = w/(h*h);
    }
    protected double getBMI()
    {
        return this.BMI;
    }
    protected String getSex()
    {
        return this.sex;
    }
    protected void setHeight(double h)
    {
        this.height = h;
    }
    protected void setWeight(int w)
    {
        this.weight = w;
    }
    abstract String popMessage();

}

