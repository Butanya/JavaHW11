package ru.netology.movie;

public class MovieManager {


    private MovieChoice[] movies = new MovieChoice[0];
    private int limit;

    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(MovieChoice movie) {

        MovieChoice[] tmp = new MovieChoice[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public MovieChoice[] findLast() {
        MovieChoice[] ans;
        if (limit < movies.length) {
            ans = new MovieChoice[limit];
        } else {
            ans = new MovieChoice[movies.length];
        }
        for (int i = 0; i < ans.length; i++) {
            int index = movies.length - i - 1;
            ans[i] = movies[index];
        }
        return ans;
    }

    public MovieChoice[] findAll() {

        return movies;
    }

}
