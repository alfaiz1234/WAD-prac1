public class Complex
{
float real,img;
Complex(){}
Complex(float x,float y)
{
real = x;
img = y;
}
Complex add (Complex a)
{
Complex temp = new Complex();
temp.real = this.real+a.real;
temp.img = this.img+a.img;
return temp;
}
Complex sub (Complex a)
{
Complex temp = new Complex();
temp.real = this.real-a.real;
temp.img = this.img-a.img;
return temp;
}
public static void main(String [] args)
{
Complex C1 = new Complex(1.1f,2.3f);
Complex C2 = new Complex(2.3f,4.5f);
Complex res;
res = C1.add(C2);
System.out.printlf("Addition:"%2.2f +2.2fi\n",res.real,res.img);
System.out.printlf("Substraction:"%2.2f +2.2fi\n",res.real,res.img);

