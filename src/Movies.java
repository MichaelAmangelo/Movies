public class Movies {
    private String title;
    private String studio;
    private String rating;

    public Movies(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movies(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating ="PG";
    }

}

