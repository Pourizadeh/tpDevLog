public class Test {

    // Programme de test avec plusieurs parties
    // et quelques erreurs volontaires pour l'exercice.

    public static void main(String[] args) {
        System.out.println("Bonjour, ceci est un test !");

        // Partie 1 : opérations simples
        int a = 10;
        int b = 0; 

        int c = a + 5;
        int d = a * 2;
        int e = c - d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int f = a / b;

        // Partie 2 : tableau et boucle for
        int[] valeurs = new int[5];
        valeurs[0] = 1;
        valeurs[1] = 2;
        valeurs[2] = 3;
        valeurs[3] = 4;
        valeurs[4] = 5;

        for (int i = 0; i < valeurs.length; i++) {
            System.out.println("valeurs[" + i + "] = " + valeurs[i]);
        }

        // Partie 3 : boucle while
        int compteur = 0;
        while (compteur < 3) {
            System.out.println("Compteur = " + compteur);
            compteur++;
        }

        // Partie 4 : conditions
        int note = 14;
        if (note >= 16) {
            System.out.println("Très bien");
        } else if (note >= 12) {
            System.out.println("Assez bien");
        } else {
            System.out.println("Peut mieux faire");
        }

        int resultatInconnu = x + 5;

        // Partie 5 : appel de méthodes
        int somme = addition(3, 4);
        System.out.println("Somme de 3 et 4 = " + somme);

        int produit = multiplication(5, 6);
        System.out.println("Produit de 5 et 6 = " + produit);

        // Partie 6 : chaîne de caractères
        String message = "Bonjour encore une fois";
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String concat = message + " - longueur : " + message.length();
        System.out.println(concat);

        System.out.println("Ligne avec erreur de syntaxe";

        // Partie 7 : boucle for-each
        String[] noms = {"Alice", "Bob", "Charlie"};
        for (String nom : noms) {
            System.out.println("Nom : " + nom);
        }

        // Partie 8 : petite "simulation"
        int age = 20;
        boolean majeur = age >= 18;
        System.out.println("Est majeur ? " + majeur);

        for (int annee = 2020; annee <= 2023; annee++) {
            System.out.println("Année : " + annee);
        }

        // Partie 9 : switch
        int jour = 3;
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Autre jour");
                break;
        }

        // Fin du main
    }

    public static int addition(int x, int y) {
        int res = x + y;
        return res;
    }

    public static int multiplication(int a, int b) {
        int res = a * b;
        return res;
    }
}