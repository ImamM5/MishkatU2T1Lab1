public class Introduction
{
    private String name;
    private int age;
    private double weight;

    public Introduction(String n, int a, double w)
    {
        name = n;
        age = a;
        weight = w;
    }

    public void introduce()
    {
        System.out.println("Hello my name is "+ name+ ", my age is "+ age + " and my weight is "+ weight+ ".");
    }

}
