public class Hogwarts {

    private String firstname;
    private String surname;
    private int magicPower;
    private int transgresRange;

    public Hogwarts(String firstname, String surname, int magicPower, int transgresRange) {
        this.firstname = firstname;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgresRange = transgresRange;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgresRange(int transgresRange) {
        this.transgresRange = transgresRange;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgresRange() {
        return transgresRange;
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.surname +
                ", Сила магии = " + this.magicPower + " Дальность трансгрессии = " + this.transgresRange;
    }

    public void anyComparison(Hogwarts other) {
        int otherPower = other.getMagicPower() + other.getTransgresRange();
        int thisPower = this.magicPower + this.transgresRange;
        if (otherPower > thisPower) {
            System.out.println(other.getFirstname() + " " + other.getSurname() +
                    " обладает большей силой магии чем " + this.getFirstname() + " " + this.getSurname());
        } else if (thisPower > otherPower) {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " обладает большей силой магии чем " + other.getFirstname() + " " + other.getSurname());
        } else {
            System.out.println(this.getFirstname() + " " + this.getSurname() +
                    " и " + other.getFirstname() + " " + other.getSurname() + " обладают сильной магией");
        }
    }
}