public class Hufflepuff extends Hogwarts {
    private int hardWork;

    public Hufflepuff(String firstname, String surname, int magicPower, int transgresRange, int hardWork) {
        super(firstname, surname, magicPower, transgresRange);
        this.hardWork = hardWork;

    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    @Override
    public String toString() {
        return super.toString() + " Трудолюбие = " + this.hardWork;
    }

    public void studentComparison(Hufflepuff other) {
        if (other.getHardWork() > this.hardWork) {
            System.out.println(other.getFirstname() + " " + other.getSurname() +
                    " лучший Пуффендуец чем " + this.getFirstname() + " " + this.getSurname());
        } else if (this.hardWork > other.getHardWork()) {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " лучший Пуффендуец чем " + other.getFirstname() + " " + other.getSurname());
        } else {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " и " + other.getFirstname() + " " + other.getSurname() + " сильные Пуффендуйцы");
        }
    }
}