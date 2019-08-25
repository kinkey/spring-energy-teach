package energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnergyFactory {

    String energyName;

    @Autowired
    Energy nuclearEnergy;

    @Autowired
    Energy solarEnergy;

    public EnergyFactory(@Value("${energy.name}") String energyName) {
        this.energyName = energyName;
    }

    public Energy getEnergy() {
        switch (energyName) {
            case "nuclear":
                return nuclearEnergy;

            case "solar":
                return solarEnergy;
        }
        return null;
    }
}
