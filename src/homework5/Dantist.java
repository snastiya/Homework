package homework5;

public class Dantist extends Doctor{

    public Dantist(String name) {
        super(name);
    }

    @Override
    public void healMetod() {
        System.out.println(name + " должен содрать денег за новые зубы");
    }
}
