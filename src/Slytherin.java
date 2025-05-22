public class Slytherin extends Hogwarts {
    private int cunning;

    public Slytherin(String firstname, String surname, int magicPower, int transgresRange, int cunning) {
        super(firstname, surname, magicPower, transgresRange);
        this.cunning = cunning;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public String toString() {
        return super.toString() + " Хитрость = " + this.cunning;
    }

    public void studentComparison(Slytherin other) {
        if (other.getCunning() > this.cunning) {
            System.out.println(other.getFirstname() + " " + other.getSurname() +
                    " лучший Слизеринец чем " + this.getFirstname() + " " + this.getSurname());
        } else if (this.cunning > other.getCunning()) {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " лучший Слизеринец чем " + other.getFirstname() + " " + other.getSurname());
        } else {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " и " + other.getFirstname() + " " + other.getSurname() + " сильные Слизеринцы");
        }
    }
}