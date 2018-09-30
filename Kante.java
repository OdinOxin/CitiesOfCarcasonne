public class Kante
{
    public static final int WIESE = 1;
    public static final int STADT = 2;
    public static final int STRASSE = 4;
    public static final int STRASSE_TUNNEL = 8;
    public static final int FLUSS = 16;
    
    private int laenge,typ;
    public Kante(int typp)
    {
        // Instanzvariable initialisieren
        laenge = 10;
        typ = typp; //0 entspricht nicht definiert, graue Seite
    }
    
    public int getTyp()
    {
        return typ;
    }
}
