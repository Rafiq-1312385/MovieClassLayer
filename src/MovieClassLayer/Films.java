package MovieClassLayer;

import java.util.ArrayList;
import java.util.List;


public class Films{

	public List<Film> Films = new ArrayList<>();

	public Films (List<Film> Films)
	{
		this.Films= Films;
	}

	public Films(){

		this.Films= null;
	}

	public List<Film> getFilms() {
		return Films;
	}

	public void setFilms(List<Film> films) {
		Films = films;
	}
}