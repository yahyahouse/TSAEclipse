package animal;

public class Spider extends Animal{

    protected Spider(int legs) {
        super(8);
    }

    @Override
    public void eat() {
        System.out.printf("Spider makan lebah");
    }
}
