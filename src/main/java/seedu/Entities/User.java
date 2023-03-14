package seedu.Entities;
public class User {
    private String name;
    private float weight;
    private float height;
    private int age;
    private String gender;

    private double caloricLimit;
    public User() {
        this.name = "";
        this.weight = 0;
        this.height = 0;
        this.age = 0;
        this.gender = "";
        this.caloricLimit = 0;
    }

    public User(String name, float weight, float height, int age, String gender) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.caloricLimit = calculateCaloricNeeds(weight, height, age, gender);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}
    public String getGender(){return this.gender;}
    public void setGender(String gender){this.gender = gender;}

    public double calculateCaloricNeeds (float weight, float height, int age, String gender) {
        double caloricNeeds;
        switch(gender.toLowerCase()){
            case "male":
                caloricNeeds = 66 + (13.7 * weight) + (5 * height) - (4.7 * age);
                return caloricNeeds;
            case "female":
                caloricNeeds = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
                return caloricNeeds;
            default:
                System.out.println("Gender not provided, cannot calculate caloric needs accurately");
                return 0;

        }
    }

    public double getCaloricLimit(){return Math.round(this.caloricLimit);}
    public double getCaloriesLeft(double calorieIntake){return Math.round(caloricLimit - calorieIntake);}

    public String[] toWriteFormat() {
        String weight = Float.toString(this.weight);
        String height = Float.toString(this.height);
        String age = Integer.toString(this.age);
        // Need to change this to update user's age and gender as well
        String[] value = { this.name, weight, height };
        return value;
    }
}
