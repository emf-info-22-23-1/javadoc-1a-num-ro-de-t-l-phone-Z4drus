package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * La méthode controleNumeroTelMobile retourne true ou false si le prefix et le
     * numéro sont valide
     * Exemples :
     * "+4177" "744 92 31" retourne true car le prefix et le numero sont valides
     * "+4171" "798 76 67" retourne false car le prefix n'est pas valide
     * "+4176" "7973331" retourne false car le numero n'est pas valide, il n'y a pas
     * d'espaces
     * "079" "733.12.33" retourne false car le numero n'est pas valide
     *
     * @param prefix Le prefix du numéro de téléphone qui est donné, les seuls
     *               prefix valides sont "+4176" "+4177" "+4178" "+4179".
     * @param numero La plage de chiffre autorisée sont les chiffres de 0-9 ainsi
     *               que les espaces.
     * @return true ou false suivant si le prefix donné en paramètres et le numéro
     *         de téléphone sont valide
     */
    public boolean controleNumeroTelMobile(String prefix, String numero) {

        boolean bprefix = false;
        boolean bnumero = false;

        try {
            if (prefix.equals("+4176") || prefix.equals("+4177") || prefix.equals("+4178") || prefix.equals("+4179")) {
                bprefix = true;
            }
        } catch (NullPointerException e) {
            System.out.println("Erreur");
            return false;

        }

        try {
            if (numero.length() != 9) { // Vérifier la longueur totale
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Erreur");
            return false;
        }

        try {
            // Enleve les espacements
            String numeroSansEspace = numero.replace(" ", "");

            Integer.parseInt(numeroSansEspace);
            if (numero.charAt(3) != ' ' || numero.charAt(6) != ' ') {
                return false; // Les espaces doivent être aux positions 3 et 6
            }
            bnumero = true;
        } catch (Exception e) {
            System.out.println("Erreur");
        }

        if (bnumero == true && bprefix == true) {
            return true;
        }
        return false;
    }

}
