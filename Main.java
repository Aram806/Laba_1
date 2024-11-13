public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Собака",4 ,"Далматин",14 , "Алексей", "Pedigree");
        String petType = dog.getType();
        int petAge = dog.getAge();
        String petBreed = dog.getBreed();
        int petWeight = dog.getWeight();
        String petOwner = dog.getOwner();
        String petFood = dog.getFood();

        System.out.println("Вид питомца - " + petType);
        System.out.println("Возраст - " + petAge + " год/а");
        System.out.println("Порода - " + petBreed);
        System.out.println("Вес - " + petWeight + " кг.");
        System.out.println("Владелец - " + petOwner);
        System.out.println("Еда - " + petFood);
        System.out.println("Возраст по человеческим годам - " + petAge*7 + " год/а");
        String dogfood  = "Собака";
        String catfood = "Кот";
        if (petType.toLowerCase().indexOf(dogfood.toLowerCase()) != -1){System.out.println("Подходящий корм - сухой корм, говядина, мясо практически любой птицы\nНеподходящий корм - рыба, авокадо, лук");}
        if (petType.toLowerCase().indexOf(catfood.toLowerCase()) != -1){System.out.println("Подходящий корм - сухой корм, злаки, курица\nНеподходящий корм - орехи, томаты, виноград");}
    }
}
