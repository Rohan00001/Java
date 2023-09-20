package SubclassAndSuperclass;

public class running extends Shoe {
    public final double weight;
    running(double weight, String Brand, int size){
        super(Brand, size);
        this.weight = weight;
    }
}
