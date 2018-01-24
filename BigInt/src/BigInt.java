import java.util.Scanner;

public class BigInt {

	public static void main(String[] args) {
	
		PrimeCal pc = new PrimeCal();
		// set pc
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		pc.setpc(in.nextInt());
		
	//	private int pc;
	//	public int getpc() {return pc;} // the 'getter' for pc
	//	public void setpc(int nextInt) {this.pc = nextInt;}		
		
		for(int i = 3, i < pc, i++)
		{
			if(pc % i ==0)
			{
				System.out.println("pc is not prime");
			}
		}
		
		if(pc < 2)
		{
			System.out.println("Not Prime");
		}

		System.out.println(pc.getpc());
		
	}

}
