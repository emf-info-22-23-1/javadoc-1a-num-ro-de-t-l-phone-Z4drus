package ch.emf.atelierpo;

import ch.emf.atelierpo.wrk.Worker;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker wrk = new Worker();
     
        if (wrk.controleNumeroTelMobile("+4177", "333 33 33")) {
            System.out.println("TEL MOBILE OK");
        } else {
            System.out.println("TEL MOBILE NOK");
        }
    }

}
