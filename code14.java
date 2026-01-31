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
        super.sound();
        System.out.println("dog barks bow bow");
    }
}
class code14{
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();

    }
}