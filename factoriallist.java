class FactorialList
{
public static void main(String[] args)
{
if(args.length==0)
System.out.println("Please provide numbers as command line arguments.");
return;
}
for(int i=0;i<args.length;i++)
{
try
{
int num=Integer.parselnt(args[i];
long fact=1;
for(int j=1;j<=num;j++)
{
fact*=j;
}
System.out.println("Factorial of"+num+"is:"+fact);
}
catch(NumberFormatException e)
{
System.out.println("Invalid input:\""+args[i]+"\"is not a valid integer.");
}
}
}
}
