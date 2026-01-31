class animal{
    void sound()
    {
        System.out.println("sound of dog and cat");

    }
}
class dog extends animal
{
    void sound()//METHOD OVERRIDING
    {
        System.out.println("dog barks bow bow");
    }
}
class code12{
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        
    }
}