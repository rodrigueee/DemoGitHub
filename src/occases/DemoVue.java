package occases;


public class DemoVue {
    public static void main(String[] args) {
        GarageVue gv=new GarageVue();
        
        
        /*gv.affMsg("salut");
        Voiture v =new Voiture("111","AAA","AAA",111,111,111);
        gv.affMsg(v);
        gv.affMsg("nom :");
        String nom=gv.getMsg();
        gv.affMsg("le nom encode est "+nom);
        String tel=gv.getMsg("tel :");
        gv.affMsg("le telephone encode est "+tel);
        
        String numchassis = gv.getMsg("numéro de chassis : ");
        String marque = gv.getMsg("Marque : ");
        String modele = gv.getMsg("modele : ");
        String kms=gv.getMsg("km : ");
        String ans=gv.getMsg("annee : ");
        String prixs=gv.getMsg("prix : ");
        try{
        int km = Integer.parseInt(kms);
        int an = Integer.parseInt(ans);
        float prix = Float.parseFloat(prixs);
        
        Voiture v2 = new Voiture(numchassis,marque,modele,km,an,prix);
        gv.affMsg(v2);
        }
        catch(NumberFormatException e){
            gv.affMsg("une erreur de transformation numérique est survenue");
        }*/
        Voiture v= gv.encodeVoiture();
        gv.affVoiture(v);
      }
}