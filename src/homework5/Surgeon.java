package homework5;

public class Surgeon extends Doctor{

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void healMetod() {
        System.out.println(name + " должен приделать бубсы");
        }
    }

