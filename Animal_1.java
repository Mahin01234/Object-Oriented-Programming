class Animal_1 {

    Animal_1(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

class Dog extends Animal_1 {

    Dog() {
        super("Animal");
    }
}