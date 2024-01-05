class A
{
public void fun1()
{
System.out.print("fun 1 is called from class A");
}
public void fun2()
{
System.out.print("fun 2 is called from class A");
}
}
class B
{
public static void main(String args[])
{
A ob=new A();
ob.fun1();
ob.fun2();
}
}