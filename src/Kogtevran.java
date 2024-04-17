public class Kogtevran extends Hogwarts {
    private byte mind;
    private byte wise;
    private byte humor;
    private byte creative;

    public Kogtevran(String fullName, byte powerOfMagic, byte transgressionDistance,
                     byte mind, byte wise, byte humor, byte creative) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wise = wise;
        this.humor = humor;
        this.creative = creative;
    }

    public byte getMind() {
        return this.mind;
    }

    public void setMind(byte mind) {
        this.mind = mind;
    }

    public byte getWise() {
        return this.wise;
    }

    public void setWise(byte wise) {
        this.wise = wise;
    }

    public byte getHumor() {
        return this.humor;
    }

    public void setHumor(byte humor) {
        this.humor = humor;
    }

    public byte getCreative() {
        return this.creative;
    }

    public void setCreative(byte creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ученик Когтеврана - " + getFullName() +
                ", сила магии = " + getPowerOfMagic() +
                ", расстояние трансгрессии = " + getTransgressionDistance() +
                ", ум = " + mind +
                ", мудрость = " + wise +
                ", остроумие = " + humor +
                ", творчество = " + creative +
                '.';
    }

    @Override
    public boolean equals(Object otherStudent) {
        if (otherStudent == null || this.getClass() != otherStudent.getClass()) {
            return false;
        }
        Kogtevran student = (Kogtevran) otherStudent;
        return getFullName().equals(student.getFullName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getFullName());
    }
}

