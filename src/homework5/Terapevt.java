package homework5;


public class Terapevt extends Doctor{

    public Terapevt() {
        super();

    }

    @Override
    public void healMetod() {
        name = "Терапевт Андрей Игоревич Тараканов";
        System.out.println(name + " может только посочувствовать");

    }

    public void whichDoctor(Patient patient){

        int codePlan = patient.getPlan();
        Doctor doctor;

        if (codePlan == 1){
            doctor = new Surgeon("Хирург Василий Петрович Тесаков");

        } else if (codePlan == 2) {
            doctor = new Dantist("Стоматолог Сергей Александрович Беззубов");

        } else {
            doctor = this;
        }

        patient.setDoctor(doctor);
        doctor.healMetod();

    }

}

