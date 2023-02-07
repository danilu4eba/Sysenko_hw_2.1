public final class HeavyBox extends Box {
    private double mass;
    private Made made;



    public HeavyBox(ColorOfBox colorOfBox, double height, double width, double mass, Made made) {
        super(colorOfBox, height, width);
        this.mass = mass;
        this.made = made;
    }

    public double getMass() {
        return mass;
    }

    public Made getMade() {
        return made;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\n Масса: " + this.mass +
                "\n Произведено:" + made.getNameOFCompany() + " "+made.getNameOfCountry() + " " + "" +made.getProductionYear();
    }


    }

