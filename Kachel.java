public class Kachel
{
    private Kante n,o,s,w;
    private boolean abtei = false;
    
    public Kachel(Kante nord, Kante ost, Kante sued, Kante west)
    {
        n = nord;
        o = ost;
        s = sued;
        w = west;
    }
    
    
    public void drucken()
    {
        String[][] p = new String[5][5];
        p[0][0] = "+";
        p[0][4] = "+";
        p[4][0] = "+";
        p[4][4] = "+";
        if(n.getTyp() == Kante.WIESE)
        {
            p[0][1] = "W";
            p[0][2] = "W";
            p[0][3] = "W";
        }
        if(n.getTyp() == Kante.STADT)
        {
            p[0][1] = "S";
            p[0][2] = "S";
            p[0][3] = "S";
        }
        if(n.getTyp() == Kante.STRASSE)
        {
            p[0][1] = "W";
            p[0][2] = "S";
            p[0][3] = "W";
        }
        if(n.getTyp() == Kante.STRASSE_TUNNEL)
        {
            p[0][1] = "W";
            p[0][2] = "T";
            p[0][3] = "W";
        }
        if(n.getTyp() == Kante.FLUSS)
        {
            p[0][1] = "W";
            p[0][2] = "F";
            p[0][3] = "W";
        }
        if(w.getTyp() == Kante.WIESE)
        {
            p[1][0] = "W";
            p[2][0] = "W";
            p[3][0] = "W";
        }
        if(w.getTyp() == Kante.STADT)
        {
            p[1][0] = "S";
            p[2][0] = "S";
            p[3][0] = "S";
        }
        if(w.getTyp() == Kante.STRASSE)
        {
            p[1][0] = "W";
            p[2][0] = "S";
            p[3][0] = "W";
        }
        if(w.getTyp() == Kante.STRASSE_TUNNEL)
        {
            p[1][0] = "W";
            p[2][0] = "T";
            p[3][0] = "W";
        }
        if(w.getTyp() == Kante.FLUSS)
        {
            p[1][0] = "W";
            p[2][0] = "F";
            p[3][0] = "W";
        }
        if(s.getTyp() == Kante.WIESE)
        {
            p[4][1] = "W";
            p[4][2] = "W";
            p[4][3] = "W";
        }
        if(s.getTyp() == Kante.STADT)
        {
            p[4][1] = "S";
            p[4][2] = "S";
            p[4][3] = "S";
        }
        if(s.getTyp() == Kante.STRASSE)
        {
            p[4][1] = "W";
            p[4][2] = "S";
            p[4][3] = "W";
        }
        if(s.getTyp() == Kante.STRASSE_TUNNEL)
        {
            p[4][1] = "W";
            p[4][2] = "T";
            p[4][3] = "W";
        }
        if(s.getTyp() == Kante.FLUSS)
        {
            p[4][1] = "W";
            p[4][2] = "F";
            p[4][3] = "W";
        }
        if(o.getTyp() == Kante.WIESE)
        {
            p[1][4] = "W";
            p[2][4] = "W";
            p[3][4] = "W";
        }
        if(o.getTyp() == Kante.STADT)
        {
            p[1][4] = "S";
            p[2][4] = "S";
            p[3][4] = "S";
        }
        if(o.getTyp() == Kante.STRASSE)
        {
            p[1][4] = "W";
            p[2][4] = "S";
            p[3][4] = "W";
        }
        if(o.getTyp() == Kante.STRASSE_TUNNEL)
        {
            p[1][4] = "W";
            p[2][4] = "T";
            p[3][4] = "W";
        }
        if(o.getTyp() == Kante.FLUSS)
        {
            p[1][4] = "W";
            p[2][4] = "F";
            p[3][4] = "W";
        }
        
        for(int i = 0; i < p.length; i++)
        {
            for(int j = 0; j < p[i].length; j++)
            {
                if(p[i][j] == null)
                    System.out.print(" ");
                else
                    System.out.print(p[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /*// Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Kachel
     *
    public Kachel()
    {
        // Instanzvariable initialisieren
        x = 4;
    }
    
    public Kachel(int anfangsX)
    {
        x = anfangs
    }

   
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     *
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
    public void setX(int neuesX)
    {
        x=neuesX;
    }*/
}
