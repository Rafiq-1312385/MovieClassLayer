package MovieClassLayer;

import java.util.List;

public class Film {
	public String FID;
	public String FName;
	public String FRating;
	public String FYear;
	public List<Actor> Actors;
	public List<Director> Directors;


	public Film(){
		this.FID= null;
		this.FName = null;
		this.FRating = null;
		this.FYear = null;
		this.Directors =null;
		this.Actors =null;
	}

	public Film(String ID, String Name, String Rating, String Year, List<Director> Director, List<Actor> Actor) {
		this.FID = ID;
		this.FName = Name;
		this.FRating = Rating;
		this.FYear = Year;
		this.Directors =Director;
		this.Actors =Actor;

	}
}