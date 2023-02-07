public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] commands = {"лежать", "Сидеть"};
        Shelter shelter = new Shelter("peace", "Lenina 1");
        Dog dog = new Dog("Rex", "ovcharka", commands, Color.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("gav");
        dog.makeVoice("giv");

        Dog dog2 = new Dog("ice", "alabai", Color.BLACK, new Shelter("VIVA", "lenina2"));
        System.out.println(dog2.getInfo());
        dog.makeVoice();
        dog.makeVoice("gav");
        dog.makeVoice("giv");


        Box ObjectA = new Box(ColorOfBox.BLUE,2.0,3.0);
        System.out.println(ObjectA.getInfo());
        Box.makeAction("упасть");
        Box.makeAction("взлететь");

        HeavyBox ObjectB = new HeavyBox(ColorOfBox.BLACK,50.0,40.1,100.0,
                new Made("China", "PIP", 2022));
        System.out.println(ObjectB.getInfo());
        HeavyBox.makeAction("кувырок");

        HeavyBox ObjectC = new HeavyBox(ColorOfBox.WHITE, 200.0, 400.3, 500.0,
                new Made("USA","GMC", 2010));
        System.out.println(ObjectC.getInfo());
        HeavyBox.makeAction("прыжок");



    }
}