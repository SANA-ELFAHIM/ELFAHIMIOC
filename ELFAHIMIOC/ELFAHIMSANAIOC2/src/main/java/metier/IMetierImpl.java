package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;  //couplage faible
    @Override
    public double calcul() {
        double temp= dao.getData();
        double res = temp *540/Math.cos(temp*Math.PI);
        return res;
    }
    /* injecter dans la variable dao un objet
           d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
