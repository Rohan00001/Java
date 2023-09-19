public class Abstract {
    public static void main(String aurs[]){
        Sbi sbi = new Sbi();
        System.out.println("The Interest rate of sbi is "+sbi.rate_of_intrest());
        HDFC hdfc = new HDFC();
        System.out.println("The Interest rate of hdfc is "+hdfc.rate_of_intrest());
    }
}

abstract class bank{
    abstract int rate_of_intrest();
}

class Sbi{
    int rate_of_intrest(){
        return 5;
    }
}

class HDFC{
    int rate_of_intrest(){
        return 7;
    }
}