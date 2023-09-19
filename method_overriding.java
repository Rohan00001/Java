public class method_overriding {
    public static void main(String arg[]){
        bank b = new sbi();
        System.out.println(b.roi());
    }
}
class bank{
    int roi(){
        return 0;
    }
}

 class sbi extends bank{
    int roi(){
        return 5;
    }
}