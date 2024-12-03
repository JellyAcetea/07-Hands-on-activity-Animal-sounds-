class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs love to eat bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep for 10-12 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("arf");
    }
}
