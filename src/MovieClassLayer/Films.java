package MovieClassLayer;

import java.util.ArrayList;
import java.util.List;


public class Films{

	private List<Film> Films = new ArrayList<>();

	public Films (List<Film> Films)
	{
		this.Films= Films;
	}

	public Films(){

		this.Films= null;
	}

	public List<Film> getFilms() {
		return this.Films;
	}

	public void setFilms(List<Film> film) {
		
		this.Films=film;
	}
}