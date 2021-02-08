public class FirstJavaProgram {

    static void myName(String word)
    {
        System.out.println("My name is " + word);
    }

    static void myAge(int age)
    {
        System.out.println("I am "+ age + " years old as of today.");
    }

    static void homeTown(String town)
    {
        System.out.println("My hometown is " + town);
    }

    public static void main(String[] args)
    {
        myName("Mark Edwards");
        myAge(30);
        homeTown("Grand Rapids, MI");
    }
}