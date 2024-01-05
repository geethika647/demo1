class A
{
public  static void fun1()
{
System.out.println("fun 1 is called from class A");
}
public static void fun2()
{
System.out.println("fun 2 is called from class A");
}
}
class B
{
public static void main(String args[])
{

A.fun1();
A.fun2();
}
}