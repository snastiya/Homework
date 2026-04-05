package homework5;


public class Patient {

    int plan;
    Doctor doctor;

    public Patient(int plan) {
        this.plan = plan;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
