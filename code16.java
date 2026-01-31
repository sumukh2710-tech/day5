interface payement{
    void pay();
}
class upi implements payement{
    public void pay()
    {
        System.out.println("payement done using upi");
    }
}
class code16
{
    public static void main(String[] args) {
        upi gpay = new upi();
        gpay.pay();
    }
}