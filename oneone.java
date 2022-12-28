import java.util.Scanner;
import java.lang.System;

public class trythis
{
private int a;
private int b, c;

 void input()
{
System.out.println("enter any two number");
Scanner mano=new Scanner();
a=mano.nextInt();
b=mano.nextInt();
}

void output()
{
c=a+b;
System.out.println("sum="+c);
}
}

 class oneone
{
public static void main(String[] args)
{
trythis myname=new trythis();
myname.input();
myname.output();
}
}