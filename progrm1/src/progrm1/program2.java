package progrm1;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String st=scan.nextLine();
		int len=st.length();
		String sttm=st.trim();
		String stsp=sttm.replaceAll("\\s+","");
		int ln=stsp.length();
		System.out.println(stsp);
		System.out.println(len);
		System.out.println(ln);
		System.out.println(len-ln);		
	}

}
