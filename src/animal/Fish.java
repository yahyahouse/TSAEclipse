package animal;

public class Fish extends Animal implements Pet{
    private String name;

    @Override
    public void eat() {
        System.out.println("ikan makan plankton");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(java.lang.String name) {

    }

    @Override
    public void play() {
        System.out.println("ikan bermain air");
    }

    @Override
    public void walk() {
        super.walk();
    }

    public Fish(){
        super(0);
    }
}
