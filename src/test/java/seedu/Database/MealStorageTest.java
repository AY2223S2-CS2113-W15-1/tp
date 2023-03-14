package seedu.database;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import seedu.entities.Food;
import seedu.entities.Meal;
import seedu.database.FoodStorage;
import seedu.database.MealStorage;


public class MealStorageTest {
    private static final String FILE_PATH = "./data/mealData.csv";
    private final FoodStorage foodStorage = new FoodStorage("./data/foodData.csv");

    @Nested
    @DisplayName("Test Read Write Functionalities")
    class ReadWriteTest {
        private final MealStorage mealStorage = new MealStorage(FILE_PATH, foodStorage);
        private ArrayList<Food> foodList = new ArrayList<Food>();
        // private final Meal meal1 = new Meal();

        @Test
        public void testAddFood() {
            assertFalse(foodStorage.getFoodsCount() == 0, "Food Storage is not empty :)");
            foodList.add(foodStorage.getFoodById(0));
            foodList.add(foodStorage.getFoodById(1));
            foodList.add(foodStorage.getFoodById(2));
            String date = "1/1/2023";
            assertDoesNotThrow(() -> mealStorage.saveMeal(new Meal(foodList, date)));
        }

        @Test
        public void testRetrieveMeal() {
            testAddFood();
            assertDoesNotThrow(() -> mealStorage.getMealById(0));
        }

        @Test
        public void testDeleteMeal() {
            testAddFood();
            assertDoesNotThrow(() -> mealStorage.deleteMeal(0));
        }
    }
}
