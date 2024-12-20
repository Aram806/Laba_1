public class Pet {

    private String type;
    private int age;
    private String breed;
    private int weight;
    private String owner;
    private String food;

    public Pet(String type, int age, String breed, int weight, String owner, String food) {
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.owner = owner;
        this.food = food;
    }

    public Pet() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
