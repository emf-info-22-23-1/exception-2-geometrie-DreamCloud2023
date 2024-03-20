package exercicegeometrieexception.ctrl;

import exercicegeometrieexception.ihm.IIhmCtrl;
import exercicegeometrieexception.wrk.IWrkCtrl;

public class Ctrl implements ICtrlIhm {

    private IIhmCtrl refIhm;
    private IWrkCtrl refWorker;

    public void demarrer() {
        refIhm.demarrer();
    }

    @Override
    public void selectCalcRadius(String value) {

        try {
            double valueDouble = Double.parseDouble(value);
            refIhm.afficheResultatCircle(String.valueOf(refWorker.calcRadiusCircleFromArea(valueDouble)));
        } catch (NumberFormatException ex) {

            refIhm.afficheMessage("Veuillez entrer une valeur valide pour le rayon du cercle  ( " + value + " invalide)");
        }
    }

    @Override
    public void selectCalcLargeur(String valueArea, String valueLongueur) {

        try {
            double valueAreaDouble = Double.parseDouble(valueArea);
            double valueLongueurDouble = Double.parseDouble(valueLongueur);
            refIhm.afficheResultatRectangle(String.valueOf(refWorker.calcLargeurFromRectangle(valueAreaDouble, valueLongueurDouble)));
        }
         catch (NumberFormatException ex) {

             try{
                 double valueAreaDouble = Double.parseDouble(valueArea);
             }
             catch(NumberFormatException ex1) {
              
                 refIhm.afficheMessage("Veuillez entrer un valeur valide pour l'air du rectangle ( " + valueArea + " invalide )");
                
             }
             
             try{
                 double valueLongueurDouble = Double.parseDouble(valueLongueur);
             }
             catch(NumberFormatException ex1) {
              
                 refIhm.afficheMessage("Veuillez entrer un valeur valide pour la largeur du rectangle ( " + valueLongueur + " invalide )");
                
             }
        }
    }

    public void setRefIhm(IIhmCtrl refIhm) {
        this.refIhm = refIhm;
    }

    public void setRefWorker(IWrkCtrl refWorker) {
        this.refWorker = refWorker;
    }

}
