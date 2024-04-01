package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {

    private IDao dao;  //couplage faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

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
