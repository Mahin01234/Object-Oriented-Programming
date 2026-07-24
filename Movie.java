// Define the Movie class
public class Movie {


// Private instance variables
private String title;
private String director;
private int duration; // duration in minutes

// Getter for title
public String getTitle() {
    return title;
}

// Setter for title
public void setTitle(String title) {
    this.title = title;
}

// Getter for director
public String getDirector() {
    return director;
}

// Setter for director
public void setDirector(String director) 
{
    this.director = director;
}

// Getter for duration
public int getDuration() {
    return duration;
}

// Setter for duration
public void setDuration(int duration) {
    this.duration = duration;
}

// Method to get movie details
public String getMovieDetails() {
    return "\nTitle: " + title
            + "\nDirector: " + director
            + "\nDuration: " + duration + " minutes\n";
            
}

// Main method
public static void main(String[] args) {

    // Create a new Movie object
    Movie movie = new Movie();

    // Set movie information
    movie.setTitle("Arrival");
    movie.setDirector("Christopher Nolan");
    movie.setDuration(146);

    // Display movie details
    System.out.println(movie.getMovieDetails());
}


}
