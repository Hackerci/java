class Calculator
{
    //int a=4,b=5,c=6;
    public void add()
    {
        int a=4,b=5,c=6;
        System.out.println("first add method"+(a+b));
    }
    
    public void add(int a,int b)
    {
        int res=a+b;
        System.out.println("\nsecond add method"+res);
    }
    
    public void add(int a,int b,int c)
    {
        System.out.println("\nthird add method"+(a+b+c));
    }
}
class Demo
{
public static void main(String[] args)
{
    Calculator c=new Calculator();
    c.add();
    c.add(5,5);
    c.add(5,4,3);
}
}