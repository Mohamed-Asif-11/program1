package progrm1;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		/*String str=sc.nextLine();
		System.out.println(str.length());
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		String str2=sc.nextLine();
		System.out.println(str.equalsIgnoreCase("Hello Tamilnadu"));
		String wos= str2.replaceAll("\\s+", "");
		System.out.println(wos);
		System.out.println(str2.substring(4,10));*/
		System.out.println("enter the plotlength:");
		double plotlength=sc.nextDouble();
		System.out.println("enter the plotwidth:");
		double plotwidth=sc.nextDouble();
		System.out.println("enter the constructlength:");
		double constructlength=sc.nextDouble();
		System.out.println("enter the constructwidth:");
		double constructwidth=sc.nextDouble();
		double area=calculatearea(plotlength,plotwidth,constructlength,constructwidth);
		System.out.println("openarea="+ area);
		}
	public static double calculatearea(double plotlength,double plotwidth,double constructlength,double constructwidth)
	{
		double openarea=0;
		openarea=plotlength*plotwidth-constructlength*constructwidth;
		return openarea;
	}

}
