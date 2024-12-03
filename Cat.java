class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats love to eat fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep for 12-16 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
