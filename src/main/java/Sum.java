/**
 * Created by ashokk on 2/1/2016.
 */
public class Sum {
    int payment=20000;
    int reward=10000;

    public void sum()
    {
        System.out.println(payment+" + "+reward+" = "+(payment+reward));
    }

    public static void main(String args[])
    {
        Sum s1=new Sum();
        s1.sum();
    }
}
