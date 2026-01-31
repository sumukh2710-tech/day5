abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("hello developer");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("circl can drawn using the compass");
    }
}
class code15
{
    public static void main(String[] args) {
        circle c = new circle();
        c.message();
        c.draw();
    }
}