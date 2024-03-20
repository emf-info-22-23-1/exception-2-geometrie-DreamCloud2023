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

            System.out.println("-------------------------------------");
            System.out.println("Il y a eu une exception");
            System.out.println("Le msg est " + ex.getMessage());
            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
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

            System.out.println("-------------------------------------");
            System.out.println("Il y a eu une exception");
            System.out.println("Le msg est " + ex.getMessage());
            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
        }
    }

    public void setRefIhm(IIhmCtrl refIhm) {
        this.refIhm = refIhm;
    }

    public void setRefWorker(IWrkCtrl refWorker) {
        this.refWorker = refWorker;
    }

}
