package progrm1;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sample2[] s2=new sample2[3];
		for(int i=0;i<s2.length;i++)
		{
			String name=sc.nextLine();
			int roll=sc.nextInt();sc.nextLine();
			String gen=sc.nextLine();
			int age=sc.nextInt();sc.nextLine();			
			s2[i]=new sample2(name,roll,gen,age);		
		}
		for(int i=0;i<s2.length;i++)
		{
			System.out.println("name: "+s2[i].getName());
			System.out.println("Rolno: "+s2[i].getRollno());
			System.out.println("Gender: "+s2[i].getGender());
			System.out.println("Age: "+s2[i].getAge());
		}
		sc.close();
		}

}
