public class Kante
{
    private final int WIESE = 1;
    private final int STADT = 2;
    private final int STRASSE = 4;
    private final int STRASSE_TUNNEL = 8;
    private final int FLUSS = 16;
    
    private int laenge,typ;
    public Kante()
    {
        // Instanzvariable initialisieren
        laenge = 10;
        typ = 0; //0 entspricht nicht definiert, graue Seite
    }
}
