package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();

        category.setId(4L);
        category.setDescription("American");

        Set<Recipe> recipes = new HashSet<>();
        category.setRecipes(recipes);

    }

    @Test
    public void getId() {
        Long idValue = 4L;
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        assertEquals("American", category.getDescription());
    }

    @Test
    public void getRecipes() {
        assertTrue(category.getRecipes().size() == 0);
    }
}