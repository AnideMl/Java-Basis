public class TestConstructor {
    public static void main(String[] args) {

        DefaultConstructor /*Класс*/ defaultObject /*имя объекта*/ = new DefaultConstructor() /*Конструктор*/ ;
        System.out.println (defaultObject.testValue);


        InitializationConstructor initializationObject = new InitializationConstructor(); //Инициализированный конструктор
        System.out.println(initializationObject.testValue);


        ParametricConstructor parametricObject = new ParametricConstructor (25); // Конструктор с параметром
        System.out.println(parametricObject.testValue);

        InitilizationBlock blockValkue = new InitilizationBlock();
        System.out.println(blockValkue.testValue);
        
        Animal wildAnimal = new Animal(20);
        System.out.println("---wildAnimal---");
        System.out.println(wildAnimal.age);
        System.out.println(wildAnimal.weight);
        
        Animal pet = new Animal(15,"Haski");
        System.out.println("---PET---");
        System.out.println(pet.name);
        System.out.println(pet.age);
        System.out.println(pet.weight);
    }
}
