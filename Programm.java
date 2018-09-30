public class Programm
{
    public static void main(String[] args)
    {
        Fenster f = new Fenster("Cities of Carcassonne");  
        
        Kachel k = new Kachel();
        f.add(k);
        
        /*
        Kachel kachel1 = new Kachel(0); //Wert x=0 in Kachel verwenden
        //Typ Name = Wert
        
        Kachel kachel2 = new Kachel(8); //Wert x=8 in Kachel verwenden
        //Speicherplatz = Werte reinschreiben
        Kachel startKachel = kachel1;
        
        //kachel1.setX(1); // Wert x=1
        //kachel2.setX(2); // Wert x=2
        
        System.out.println(kachel1.beispielMethode(0)); //Wert y=0 wird an beispielMethode übergeben
        System.out.println(kachel2.beispielMethode(4)); //Wert y=4 wird an beispielMethode übergeben
        */
    }
}