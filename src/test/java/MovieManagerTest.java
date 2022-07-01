import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.movie.MovieChoice;
import ru.netology.movie.MovieManager;

class MovieManagerTest {
    private MovieManager manager = new MovieManager();

    private MovieChoice first = new MovieChoice(1, "It", "horror", 1999, 23 / 05 / 22);
    private MovieChoice second = new MovieChoice(2, "The Boys", "thriller", 2020, 22 / 01 / 22);
    private MovieChoice third = new MovieChoice(3, "Номер один", "comedy", 2012, 13 / 12 / 20);
    private MovieChoice fourth = new MovieChoice(4, "The OA", "thriller", 2017, 19 / 11 / 21);

    @Test
    void shouldFindAll() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieChoice[] actual = manager.findAll();
        MovieChoice[] expected = new MovieChoice[]{first, second, third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMovie() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);


        MovieChoice[] actual = manager.findAll();
        MovieChoice[] expected = new MovieChoice[]{first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLast() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.findAll();
        MovieChoice[] actual = manager.findLast();
        MovieChoice[] expected = new MovieChoice[]{fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLast3() {
        MovieManager manager2 = new MovieManager(3);

        manager2.add(first);
        manager2.add(second);
        manager2.add(third);
        manager2.add(fourth);
        manager2.findAll();

        MovieChoice[] actual = manager2.findLast();
        MovieChoice[] expected = new MovieChoice[]{fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);

    }
}