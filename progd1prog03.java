//+-*% commandLineArgument
class Demo3
{
public static int add(int a,int b)
{
return a+b;
}
public static int sub(int a,int b)
{
return a-b;
}
public static int mul(int a,int b)
{
return a*b;
}
public static int mod(int a,int b)
{
return a%b;
}
public static int div (int a,int b)
{
return a/b;
}
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int res=Demo3.add(n1,n2);
int res1=Demo3.sub(n1,n2);
int res2=Demo3.mul(n1,n2);
int res3=Demo3.mod(n1,n2);
int res4=Demo3.div(n1,n2);
System.out.println(res);
System.out.println(res1);
System.out.println(res2);
System.out.println(res3);
System.out.println(res4);
}
}
