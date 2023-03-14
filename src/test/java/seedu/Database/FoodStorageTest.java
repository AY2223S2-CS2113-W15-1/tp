package seedu.database;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import seedu.entities.Food;

public class FoodStorageTest {
    private static final String FILE_PATH = "./data/foodData.csv";

    @Nested
    @DisplayName("Test Read Functionalities")
    class ReadTest {
        private final FoodStorage foodStorage = new FoodStorage(FILE_PATH);

        @Test
        public void testFoodStorageSize() {
            assertFalse(foodStorage.getFoodsCount() == 0, "Food Storage is not empty :)");
        }

        @Test
        public void testRetrieveFood() {
            assertDoesNotThrow(() -> foodStorage.getFoodById(0));
        }

        @Test
        public void testFilterByName() {
            List<Food> foods = assertDoesNotThrow(() -> foodStorage.getFoodsByName("chicken"));
            assertFalse(foods.size() == 0, "Filter returned values :)");
        }
    }
}
