package animal;

public class Cat extends Animal implements Pet{
    private String name;
    protected Cat(String name) {
        super(4);
        this.name =name;
    }
    public  Cat(){
        this("tom");
    }
    @Override
    public void eat() {
        System.out.printf("Kucing makan ikan");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }
}
