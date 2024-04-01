package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version bdd");
        /*
        se connecter à la BDD
         */
        double temp= Math.random()*40;
        return temp;
    }
}
