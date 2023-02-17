package presentation.modele;

public class Admin  extends Utilisateur{

    private static  Admin ADMIN = new Admin();

    private Admin(){

        login       = "admin";
        motDePasse  = "4444";
        role        = "Admin";
        nom         =  "Admin";
        prenom      = "saad";

    }


    public static Admin getInstance(){

        return ADMIN;
    }

}
