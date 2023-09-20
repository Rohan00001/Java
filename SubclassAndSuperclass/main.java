package SubclassAndSuperclass; 

public class main { 
    public static void main(String[] args) {
        Shoe nike = new Shoe("Nike",7);
        System.out.println(nike.Brand+" has shoes of size "+nike.Size);
        walking w1 = new walking(false, "nike", 7);
        System.out.println(w1.Brand+" is running "+w1.gorTex);
        running r1 = new running(250, "Adidas", 8);
        System.out.println("The person running wearing "+r1.Brand+" shoes, which has weight of "+r1.weight+" and size "+r1.Size);
    }
}
