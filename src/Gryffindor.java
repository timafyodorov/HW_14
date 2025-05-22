public class Gryffindor extends Hogwarts {
    private int bravery;

    public Gryffindor(String firstname, String surname, int magicPower, int transgresRange, int bravery) {
        super(firstname, surname, magicPower, transgresRange);
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Храбрость = " + this.bravery;
    }

    public void studentComparison(Gryffindor other) {
        if (other.getBravery() > this.bravery) {
            System.out.println(other.getFirstname() + " " + other.getSurname() +
                    " лучший Гриффендорец чем " + this.getFirstname() + " " + this.getSurname());
        } else if (this.bravery > other.getBravery()) {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " лучший Гриффендорец чем " + other.getFirstname() + " " + other.getSurname());
        } else {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " и " + other.getFirstname() + " " + other.getSurname() + " сильные Гриффендорцы");
        }
    }
}