package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    AfishaManager afisha = new AfishaManager();

    Movie first = new Movie(1, "Век Адалин", "Драма", false);
    Movie second = new Movie(2, "Семь жизней", "Драма", false);
    Movie third = new Movie(3, "Молчание ягнят", "Триллер", false);
    Movie fourth = new Movie(4, "Запах женщины", "Драма", false);
    Movie fifth = new Movie(5, "Красотка", "Драма", false);
    Movie sixth = new Movie(6, "Крепкий орешек", "Боевик", false);
    Movie seventh = new Movie(7, "Один дома", "Комедия", false);
    Movie eighth = new Movie(8, "Неудержимые", "Боевик", false);
    Movie ninth = new Movie(9, "Мачо и ботан", "Комедия", false);
    Movie tenth = new Movie(10, "Калифорникейшн", "Комедия", false);


    @Test
    void shouldShowTenMovies() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);


        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third,second,first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowAllMovies() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{first, second, third, fourth, fifth, sixth, seventh,eighth,ninth,tenth};

        Assertions.assertArrayEquals(expected, afisha.findAll());
    }

    @Test
    void shouldShowMoviesUnderTen() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);

        Movie[] expected = new Movie[]{
                sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowMoviesLast() {

        AfishaManager afisha = new AfishaManager(6);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, afisha.findLast());
    }
}