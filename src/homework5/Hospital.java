package homework5;


public class Hospital {

    public static void main(String[] args) {


        Terapevt terapevt = new Terapevt();

        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);

        terapevt.whichDoctor(patient1);
        terapevt.whichDoctor(patient2);
        terapevt.whichDoctor(patient3);

    }

}
