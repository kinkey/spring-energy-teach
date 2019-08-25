package energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SolarEnergy implements Energy {

    private int energyLevel;

    public int getEnergyLevel() {
        return energyLevel;
    }

    public SolarEnergy(@Value("${solar.value}") int energyLevel) {
        this.energyLevel = energyLevel;
    }

}
