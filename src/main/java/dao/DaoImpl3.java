package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao3")
@Profile("comm")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl3 implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de communication");
        return 1929.5;
    }
}