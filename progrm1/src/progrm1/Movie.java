package progrm1;

public class Movie {
	private String name;
	private String production;
	private String genre;
	private int budget;
	Movie(String name,String production,String genre,int budget)
	{
		this.name=name;
		this.production=production;
		this.genre=genre;
		this.budget=budget;
	}
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}*/
	public String getGenre() {
		return genre;
	}
	/*public void setGenre(String genre) {
		this.genre = genre;
	}*/
	public int getBudget() {
		return budget;
	}
	/*public void setBudget(int budget) {
		this.budget = budget;
	}*/
	
}
