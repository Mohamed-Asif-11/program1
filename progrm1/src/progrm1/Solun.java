package progrm1;

import java.util.Scanner;

public class Solun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Movie[] movie=new Movie[4];
		for(int i=0;i<movie.length;i++)
		{
			String name=sc.nextLine();
			String production=sc.nextLine();
			String genre=sc.nextLine();
			int budget=sc.nextInt();sc.nextLine();
			movie[i]=new Movie(name,production,genre,budget);
		}
		System.out.println("enter the search genre:");
		String search=sc.nextLine();
		Movie[] result=searchterm(search,movie);
		for(int k=0;k<result.length;k++)
		{
			if(result[k].getBudget()>50000000) {
				System.out.println("high budget movie");
				System.out.println(result[k].getName());}
			else
				{
				System.out.println("low budget movie");
				System.out.println(result[k].getName());
				}
				}
		}
		
public static Movie[] searchterm(String search,Movie[] movie)
	{
		int i=0;
		Movie[] temp=new Movie[4];
		for(int j=0;j<movie.length;j++)
		{
			if(movie[j].getGenre().toLowerCase().equals(search.toLowerCase()))
			{
				temp[i++]=movie[j];
			}
		}
		return temp;
		
	}

}
