package MovieClassLayer;

public class SimplisticFilm {

	public String FilmID;
	public String FilmName;


	public SimplisticFilm() {}


	public SimplisticFilm(String filmID ,String filmName) {

		this.FilmID=filmID;
		this.FilmName=filmName;
	}

	public String getFilmName() {
		return FilmName;
	}

	public void setFilmName(String filmName) {
		FilmName = filmName;
	}

	public String getFilmID() {
		return FilmID;
	}

	public void setFilmID(String filmID) {
		FilmID = filmID;
	}

}
