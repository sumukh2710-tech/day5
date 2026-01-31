class animal{
    void sound()
    {
        System.out.println("there different types animal");

    }
}
class mammals extends animal
{
    void bark()
    {
        System.out.println("animals give birth");
    }
}
class humans extends mammals{
    void feature()
    {
        System.out.println("humans can talk");
    }

}
class code10{
    public static void main(String[] args) {
        humans h = new humans();
        h.feature();
        h.bark();
        h.sound();
    }
}