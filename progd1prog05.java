class G
{
public static void main()
{
System.out.println("main method without arguments");
}
public static void main(int g)
{
System.out.println("main method with integer arguments"+g*6);
}
public static void main(String s)
{
System.out.println("welcome"+s);
}
public static void main(String args[])
{
System.out.println("main method with string arguments");
main();
main("main method with strings");
main(5);
}
}