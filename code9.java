class animal{
    void sound()
    {
        System.out.println("ever animal bake different sound");

    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("dog barks bow bow");
    }
}
class code9{
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.sound();
    }
}