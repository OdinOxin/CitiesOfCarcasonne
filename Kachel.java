import java.awt.Graphics;
import javax.swing.JPanel;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Kachel extends JPanel
{
    private Kante n,o,s,w;
    private boolean abtei = false;
    
    private BufferedImage tile;
    
    public Kachel()
    {
        try
        {
            tile = ImageIO.read(new File("tile_1.jpg"));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(tile, 0, 0, this);
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
