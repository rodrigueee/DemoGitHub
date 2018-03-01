
package occases;

public class TestV {
     public static void main(String[] args) {
        GarageVue vue=new GarageVue();
        
        
        String chassis = vue.getMsg("Numéro de chassis ? : ");
        String marque = vue.getMsg("Marque du véhicule ? : ");
        String modele = vue.getMsg("Modèle du véhicule ? : ");
        String km = vue.getMsg("Combien de km ? ");
        int kmInt= Integer.parseInt(km);
        String annee = vue.getMsg("Combien d'année ? ");
        int annees = Integer.parseInt(annee);
        String prix = vue.getMsg("Quel est le prix ? ");
        double prixDouble = Integer.parseInt(prix);
        
        Voiture v =new Voiture(chassis,marque,modele,kmInt,annees,prixDouble);
        vue.affMsg(v);
      }
    
}
