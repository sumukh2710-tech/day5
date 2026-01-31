class animal{
    animal()
    {
        System.out.println("there different types animal");

    }
}
class dog extends animal
{
    dog() {
        super();
    }
    
    void bark()
    {
        System.out.println("animals give birth");
    }
}

class code13{
    public static void main(String[] args) {
      dog d = new dog();
      d.bark();
    }
}