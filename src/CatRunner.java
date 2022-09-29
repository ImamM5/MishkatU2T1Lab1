import java.io.CharArrayReader;

public class CatRunner
{
    public static void main (String [] args)
    {
        Cat cat1 = new Cat("Ginger", 10, 50.4 );
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Java", 9, 20.6);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
