package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test
    public void testFilm_id(){
    Film testFilm = new Film(1005, "batman", "man in bat costume fights crime", 1, 86);
    Assertions.assertEquals(1005, testFilm.getFilm_id(), "The film did not have the same film id");
    }
    @Test
    public void testTitle(){
        Film testFilm = new Film(1005, "Batman", "man in bat costume fights crime", 1, 86);
        Assertions.assertEquals("Batman", testFilm.getTitle(), "The film did not have the same title");
    }
    @Test
    public void testDescritpion(){
        Film testFilm = new Film(1005, "batman", "man in bat costume fights crime", 1, 86);
        Assertions.assertEquals("man in bat costume fights crime", testFilm.getDescription(), "The film did not have the same description");
    }
    @Test
    public void testlanguage_id(){
        Film testFilm = new Film(1005, "batman", "man in bat costume fights crime", 1, 86);
        Assertions.assertEquals(1, testFilm.getLanguage_id(), "The film did not have the same language id");
    }
    @Test
    public void testlength(){
        Film testFilm = new Film(1005, "batman", "man in bat costume fights crime", 1, 84);
        Assertions.assertEquals(84, testFilm.getLength(), "The film did not have the same length");
    }
}
