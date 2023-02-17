package presentation.modele;

import java.util.*;

public class Banque {

    private static long         compteur = 1;
    private Long                idBanque;
    private String              nomBanque;
    private String              adresseBanque;
    private String              telBanque;
    private String              emailBanque;
    private List<Client>        clientsDeBanque = new ArrayList<>();

    public Banque(){idBanque = compteur++;}
    public Banque(String nom, String adresse, String tel, String mail){
    	idBanque        = compteur++;
    	nomBanque       = nom;
        telBanque       = tel;
        adresseBanque   = adresse;
        emailBanque     = mail;
        Client client1 = new Client("client1", "client", "jibawi", "anwar", "anwar1@gmail.com", "b65167", "O616337788", Sexe.HOMME);
        Client client2 = new Client("client2", "client", "saadi", "halima", "halima1@gmail.com", "b78128", "O616227799", Sexe.FEMME);
        Client client3 = new Client("client3", "client", "hamza", "hamza", "hamza1@gmail.com", "b88169", "O616887744", Sexe.HOMME);
        List<Compte> comptes1 = new ArrayList<>();
        List<Compte> comptes2 = new ArrayList<>();
        List<Compte> comptes3 = new ArrayList<>();
        comptes1.add(new Compte(20000.0, client1));
        comptes2.add(new Compte(61000.0, client2));
        comptes2.add(new Compte(43000.0, client2));
        comptes3.add(new Compte(82000.0, client3));
        client1.setComptesClient(comptes1);
        client2.setComptesClient(comptes2);
        client3.setComptesClient(comptes3);
        clientsDeBanque.add(client1);
        clientsDeBanque.add(client2);
        clientsDeBanque.add(client3);
        
    }

    public Long             getIdBanque() {return idBanque;}
    public String           getNomBanque() {return nomBanque;}
    public String           getEmailBanque() {return emailBanque;}
    public String           getTelBanque() {return telBanque;}
    public String           getAdresseBanque() {return adresseBanque;}
    public List<Client>     getClientsDeBanque() {return clientsDeBanque;}

    public void             setIdBanque(Long idBanque) {this.idBanque = idBanque;}
    public void             setNomBanque(String nomBanque) {this.nomBanque = nomBanque;}
    public void             setEmailBanque(String emailBanque) {this.emailBanque = emailBanque;}
    public void             setAdresseBanque(String adresseBanque) {this.adresseBanque = adresseBanque;}
    public void             setTelBanque(String telBanque) {this.telBanque = telBanque;}
    public void             setClientsDeBanque(List<Client> clientsDeBanque) {this.clientsDeBanque = clientsDeBanque;}
    
    @Override
    public String toString() {
    	String      BanqueStr  = "------------------------------------------------------\n";
    	BanqueStr += "| Id banque               : "   + getIdBanque()   + "\n";
    	BanqueStr += "| Nom banque              : "   + getNomBanque()    + "\n" ;
    	BanqueStr += "| Email banque            : "   + getEmailBanque() + "\n" ;
    	BanqueStr += "| Tel banque              : "   + getTelBanque() + "\n" ;
    	BanqueStr += "| Adresse banque          : "   + getAdresseBanque() + "\n" ;
    	BanqueStr += "------------------------------------------------------\n";

    	return BanqueStr;
    }
}
