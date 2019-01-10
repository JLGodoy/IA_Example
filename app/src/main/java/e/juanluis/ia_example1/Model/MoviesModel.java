package e.juanluis.ia_example1.Model;

public class MoviesModel  {
    private int id;
    private String title;
    private String year;
    private String genre;
    private String posterUrl;

    public MoviesModel(int id, String title, String year, String genre, String posterUrl){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.posterUrl = posterUrl;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPosterUrl() {
        return posterUrl;
    }
}
