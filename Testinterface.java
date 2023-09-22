package Interfacepack;

public class Testinterface implements Printable,Showable
{
   public void print()
   {
	   System.out.println("hello");
   }
   public void show()
   {
	   System.out.println("Everyone");
   }
	public static void main(String[] args) 
	{
	  Testinterface t=new Testinterface();
	  t.print();
	  t.show();
	}

}
