public class Ravenclaw extends Hogwarts {
    private int intelligence;

    public Ravenclaw(String firstname, String surname, int magicPower, int transgresRange, int intelligence) {
        super(firstname, surname, magicPower, transgresRange);
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return super.toString() + " Интеллект = " + this.intelligence;
    }

    public void studentComparison(Ravenclaw other) {
        if (other.getIntelligence() > this.intelligence) {
            System.out.println(other.getFirstname() + " " + other.getSurname() +
                    " лучший Когтевранец чем " + this.getFirstname() + " " + this.getSurname());
        } else if (this.intelligence > other.getIntelligence()) {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " лучший Когтевранец чем " + other.getFirstname() + " " + other.getSurname());
        } else {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " и " + other.getFirstname() + " " + other.getSurname() + " сильные Когтевранцы");
        }
    }
}