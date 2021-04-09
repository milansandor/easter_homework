import org.apache.logging.log4j.*;


public class Main {

    private static final Marker Kijelento_MARKER = MarkerManager.getMarker("Kijelentő!");
    private static final Marker Kerdo_MARKER = MarkerManager.getMarker("Kérdő!");
    private static final Marker Felkialto_MARKER = MarkerManager.getMarker("Felkiáltó!");
    //private static final Marker Sor_MARKER = MarkerManager.getMarker("Sor!");
    private static final Logger logger = LogManager.getLogger();
    private static final Thread t = new Thread();

    public static void main(String[] args) throws InterruptedException {
        /*
        * Jöttem végig az utakon.
        * Felém hajolt sok-sok virág,
        * Rózsavizük osztogatták.
        * Megöntözlek most itt véle,
        * Piros tojást várok érte!
        * Szabad-e locsolni?
        *
        * */
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            ThreadContext.put("iteration",String.valueOf(i));
            logger.error(Kijelento_MARKER, "Jöttem végig az utakon.");
            logger.fatal("Felém hajolt sok-sok virág,");
            logger.error(Kijelento_MARKER, "Rózsavizük osztogatták.");
            logger.fatal("Megöntözlek most itt véle,");
            logger.error(Felkialto_MARKER,"Piros tojást várok érte!");
            logger.fatal(Kerdo_MARKER,"Szabad-e locsolni?");
            t.sleep(2000);
        }
    }


}
