package ch.emf.atelierpo.wrk;


/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    
    /**
     * La méthode controleNumeroTelMobile retourne true ou false si le prefix et le numéro sont valide
     * Exemples :
     * "+4177" "744 92 31" retourne true car le prefix et le numero sont valides
     * "+4171" "798 76 67" retourne false car le prefix n'est pas valide
     * "+4176" "7973331"   retourne false car le numero n'est pas valide, il n'y a pas d'espaces
     * "079" "733.12.33"   retourne false car le numero n'est pas valide
     *
     * @param prefix Le prefix du numéro de téléphone qui est donné, les seuls prefix valides sont "+4176" "+4177" "+4178" "+4179".
     * @param numero La plage de chiffre autorisée sont les chiffres de 0-9 ainsi que les espaces.
     * @return true ou false suivant si le prefix donné en paramètres et le numéro de téléphone sont valide
     */
    public boolean controleNumeroTelMobile(String prefix, String numero) {
        return false;
    }

}
