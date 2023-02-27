package atmappmain;

import java.util.Scanner;

public abstract class Server
{
	public int uid=937323;
	public int upw=1234;
	public int id;
	public int pw;
	public double amount;
	static double bankBalance=30000;
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the UserID");
		id=s.nextInt();
		System.out.println("Enter the PassWord");
		pw=s.nextInt();
	}
	abstract void verify() throws Exception;
	
}