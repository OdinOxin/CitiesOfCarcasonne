public class Programm
{
    public static void main(String[] args)
    {
        int[] stapel = {20,15,15,4,10};
        Kachel[] kacheln = new Kachel[16];
        
        Kante kante1 = null;
        Kante kante2 = null;
        Kante kante3 = null;
        Kante kante4 = null;
        for(int i = 0; i < kacheln.length; i++)
        {
            int zufall = (int) (Math.random() * (5-1) + 1);
            stapel[zufall] = stapel[zufall] - 1;
            if(kante1 == null)
                kante1 = new Kante((int) Math.pow(2, zufall));
            else if(kante2 == null)
                kante2 = new Kante((int) Math.pow(2, zufall));
            else if(kante3 == null)
                kante3 = new Kante((int) Math.pow(2, zufall));
            else if(kante4 == null)
                kante4 = new Kante((int) Math.pow(2, zufall));
                
            System.out.println(zufall);
            
            if(kante1 != null && kante2 != null && kante3 != null && kante4 != null)
            {
                kacheln[i] = new Kachel(kante1, kante2, kante3, kante4);
                kacheln[i].drucken();
                kante1 = null;
                kante2 = null;
                kante3 = null;
                kante4 = null;
            }
        }
        
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