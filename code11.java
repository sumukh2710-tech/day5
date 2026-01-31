class animal{
    void sound()
    {
        System.out.println("sound of dog and cat");

    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("dog barks bow bow");
    }
}
class cat extends animal{
    void bark()
    {
        System.out.println("cat sound meow meow");
    }

}
class code11{
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.bark();
        d.sound();
        c.bark();
    }
}