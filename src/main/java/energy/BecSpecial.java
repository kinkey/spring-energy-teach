package energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BecSpecial {

    private Energy energie;

    @Autowired
    public BecSpecial(@Qualifier("energyFactory") EnergyFactory energyFactory) {
        energie = energyFactory.getEnergy();
    }

    public void getNivelEnergieDinBec() {
        System.out.println("Energie : " + energie.getEnergyLevel());

        if (energie.getEnergyLevel() >= 5) {
            System.out.println("avem energie suficienta");
        } else {
            System.out.println("nu avem energie suficienta");
        }
    }
}
