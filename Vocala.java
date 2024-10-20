import java.util.Scanner;

public class Vocala {
    public String cuvant;

    public Vocala(String cuvant)
    {
        this.cuvant = cuvant;
    }
    public int getNumarVocale()
    {
        int nrVocale = 0;
        for(int i=0; i<cuvant.length() ; i++)
        {
            char c = cuvant.charAt(i);
            if(c =='a' || c =='e' || c=='i' || c =='o' || c =='u' || c =='A' || c =='E' || c=='I' || c =='O' || c =='U')
                nrVocale++;
        }
        return nrVocale;
    }
    public int getNumarConsoane()
    {
        int nrConsoane = 0;
        for(int i=0; i<cuvant.length() ; i++)
        {
            char c = cuvant.charAt(i);
            if(Character.isLetter(c) && !(c =='a' || c =='e' || c=='i' || c =='o' || c =='u' || c =='A' || c =='E' || c=='I' || c =='O' || c =='U'))
                nrConsoane++;
        }
        return nrConsoane;
    }

    public void gasesteIndici(String vocala)
    {

        System.out.print("Indicii vocalei '" + vocala + "' sunt: ");
        boolean found = false;

        for (int i = 0; i < cuvant.length(); i++) {
            if ((cuvant.charAt(i)) == vocala.charAt(0)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Vocala nu a fost găsită.");
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String contineVocale = "Abc edf io";
        Vocala vocala = new Vocala(contineVocale);
        System.out.println("Numarul de vocale este: "+ vocala.getNumarVocale());
        System.out.println("Numarul de consoane este: "+ vocala.getNumarConsoane());

        System.out.println("Cititi o vocala de la tastatura ");
        Scanner in = new Scanner(System.in);
        String newVocala = in.nextLine();
        vocala.gasesteIndici(newVocala);
        in.close();
    }
}
