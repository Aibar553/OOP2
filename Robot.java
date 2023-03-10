public class Robot extends Sportsman {
    public static final String OBJCLASS = "Robot";
    public static final String SUCCESSFULLRUNRESULT = "ran a ridiculous distance for a robot";
    public static final String BADRUNRESULT = "tired, depressed and out of the competition.";
    public static final String SUCCESSFULJUMPRESULT = "easily jumped the wall height";
    public static final String BADJUMPRESULT = " he could not overcome this obstacle, so he is eliminated.";

    public Robot(String name, int maxdistance, double maxheight) {
        super(name, maxdistance, maxheight);
        super.info = OBJCLASS + " name " + name;
        super.successfulrunresult = SUCCESSFULLRUNRESULT;
        super.badrunresult = BADRUNRESULT;
        super.successfuljumpresult = SUCCESSFULJUMPRESULT;
        super.badjumpresult = BADJUMPRESULT;
    }

}
