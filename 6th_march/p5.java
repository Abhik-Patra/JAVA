class Base {
	int x=2;

	Base(int _x)
     { 
        x=_x ; 
    }
}

class Derived extends Base {

	int y;
	Derived(int _x, int _y)
	{

		super(_x);
		y = _y;
	}

	void Display()
	{
		System.out.println("x = " + x + ", y = " + y);
	}
}


public class p5 {

	
	public static void main(String[] args)
	{

		
		Derived d = new Derived(10, 20);

		
		d.Display();
	}
}
