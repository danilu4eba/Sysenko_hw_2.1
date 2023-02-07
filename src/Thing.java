public abstract class Thing {
    private ColorOfBox colorOfBox;

    public Thing(ColorOfBox colorOfBox) {
        this.colorOfBox = colorOfBox;
    }

    public ColorOfBox getColorOfBox() {
        return colorOfBox;
    }
    public String getInfo() {
        return "ColorOfBox: " + this.colorOfBox;


    }


}
