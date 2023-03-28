# ***Life Tracker user guide***

## Introduction

**_Life Tracker_** is an application that allows users who are health conscious automate the tracking of their calories and keep a record of 
their calorie intake history.

The app also allows users to keep track of their daily exercises to compute their calorie loss.


## Quick Start


1. Ensure that you have Java 11 or above installed.
2. Down the latest version of `LifeTracker` from [here](https://github.com/AY2223S2-CS2113-W15-1/tp).
3. Copy the file to the folder you want ot use as the home folder for your LifeTracker.
4. Open a command terminal, cd into the folder you put the jar file in, and use the java -jar lifetracker.jar command to run the application.
5. Type the command in the command box and press Enter to execute it. 
6. Refer to the features below for details of each command.

## Features v2.0

* View and Update user profile
* Add meal
* Delete meal
* Add Exercise
* Calculate caloric needs
* Calculate amount of calories left in the day
* Find the nutrition of a certain kind of food
* Filter foods based on calories
* Track Calorie Intake

### Viewing User Profile: `view`

To view user's profile

Format: `view`

Menu Output:
![view-menu](./UG-images/view-menu.png)

User can input **1 - 8** to view their current profile

1. Name
2. Weight
3. Height
4. Age
5. Gender
6. Daily Caloric Limit
7. Calories Remaining for today
8. Exit

Example:
![view-example](./UG-images/view-example.png)

User then can input **1** to continue viewing their profile or **2** to exit

### Updating User Profile: `update`

Allows the user to update any of their information.
User will come across a menu that shows them what information they can choose to update, they will need
to input the number in order to update the specific information they want to change.

Format: `update`

Menu Output:
![update-menu](./UG-images/update-menu.png)

User can input **1 - 5** to customise their profile

1. Name
2. Weight
3. Height
4. Age
5. Gender
6. Exit

Example:
![update-example](./UG-images/update-example.png)

User then can input **1** to continue updating their profile or **2** to exit

### Adding a meal: `add`

Adds a new meal to database

Format: `add /on [date] /type [MealType] /foods [foods]`

* The `date` should be in `dd/mm/yy` format
* The `MealType` can be one of the following
  * Breakfast
  * Lunch
  * Dinner
* The `foods` is a list of foods seperated by `, ` (Comma with a space after)

Example of usage:

`add /on 3/3/2023 /type Lunch /foods Spaghetti, Alfredo (Small)`

![add-example](./UG-images/add-example.png)

#### Alternative

For Users who are not experienced with typing fast on keyboards, *LifeTracker* offers a menu option to add meal

Format: `add`

![add-alt-example](./UG-images/add-example2.png)

### Listing foods: `list`

For uses to view all foods currently supported in the *LifeTracker* database

Format: `list foods`

Example:
![list-foods-example](./UG-images/list-foods-example.png)

### Listing meals: `list`

For users to view previously added meals

Format: `list meals`

Example:
![list-meals-example](./UG-images/list-meals-example.png)

### Deleting meals: `delete`

For users to remove previously added meals

Format: `delete [index]`

* The `index` should be a positive integer and must be less than number of meals added
* It is recommended to run `list meals` beforehand to get the index of the meal you want to delete

Example:
![delete-example](./UG-images/delete-example.png)

### Filtering foods: `filter`

For users to filter the foods by their calorie content. The user needs to input the lower and higher bound that they want to filter by.

Format: `filter`

* The lower and upper limit should be a `float`

Example:
![filter-example](./UG-images/filter-example.png)

### View Nutrition Content of food: `nutrition`

For users to view the nutrition content of the food. The user first needs to search for the food, then the nutrition content of the food will be printed.

Format: `nutrition`

* The first food search should be in English
* To select the particular food filtered, an integer should be inputted
* To continue searching for more food, **1** should be inputted when prompted after, else input any number to exit

Example:
![nutrition-example](./UG-images/nutrition-example.png)

### Add Exercise: `exercise`

For user to input the exercise done previously

Format: `exercise /type [exercise name] /description [exercise description] /calories [calories burnt] /on [date]`

* The `exercise name` and `exercise description` accepts any input
* The `calories` should be in `float` format
* The `date` should be in `dd/mm/yy` format

Example:
![exercise-example](./UG-images/exercise-example.png)

### Track net calorie intake: `track`

For user to track their previous net calorie intake

Format: `track`

Output:
![track-example](./UG-images/track-example.png)

### Exiting the program: `bye`
Allows user to exit program.

Output:
![bye-example](./UG-images/bye-example.png)

## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: Do copy the `data` folder and its contents to the new computer

**Q**: Where do you get the data for the food from?

**A**: The nutrition data is based on food from NUS TechnoEdge canteen, as this application would be mainly targeted at NUS Engineering students who would eat there regularly. 

## Command Summary

| Action  | Format, Examples |
| ------------- | ------------- |
| View | view  |
| Update  | update  |
| add  | add /on [date] /type [MealType] /foods [foods]  |
| list  | list foods or list meals  |
| delete  | delete INDEX e.g delete 3  |
| filter  | filter  |
| nutrition  | nutrition  |
| exercise  | exercise /type [exercise name] /description [exercise description] /calories [calories burnt] /on [date]  |
| track  | track  |
| bye  | bye  |

