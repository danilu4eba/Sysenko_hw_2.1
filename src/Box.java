public  class Box extends Thing{
    private double height;
    private double width;

    public  Box(ColorOfBox colorOfBox) {
        super(colorOfBox);
    }

    public  Box(ColorOfBox colorOfBox, double height) {
        super(colorOfBox);
        this.height = height;
    }

   public    Box(ColorOfBox colorOfBox, double height, double width) {
        super(colorOfBox);
        this.height = height;
        this.width = width;
    }



    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\n Высота" + this.height +
                "\n Ширина" + this.width;
    }


    public static void makeAction(String Action1) {
        System.out.println(Action1);
    }


}
