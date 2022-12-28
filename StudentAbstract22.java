interface Area 
{
    void calculateArea();
}
class Square implements Area
{
    public void calculateArea()
    {
        int a=2;
        int are=a*a;
        System.out.println("\n area of square:"+are);
    }
}
class Circle implements Area
{
    public void calculateArea()
    {
        int r=5;
        double pi=3.14;
        System.out.println("\n area of square:"+(pi*r*r));
    }
}

class Triangle implements Area
{
    public void calculateArea()
    {
        int b=5,h=12;
        int res=(b*h)/2;
        System.out.println("\n area of triangle:"+res);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Area a=new Triangle();
        a.calculateArea();
        
        Area b=new Circle();
        b.calculateArea();
        
        Area c=new Square();
        c.calculateArea();
    }
}