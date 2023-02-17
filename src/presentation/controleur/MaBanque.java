package presentation.controleur;

import metier.authentification.ServiceAuth;
import presentation.modele.Banque;

public class MaBanque {
        public static ServiceAuth loginService;

        public static void main(String[] args) {

                Banque maBanque = new Banque("mp", "kenitra", "212535225588", "mp@banquemp.ma");
                loginService = new ServiceAuth(maBanque);
                loginService.seConnecter();
        }
}
