import energy.Bec;
import energy.Energy;
import energy.NuclearEnergy;
import energy.SolarEnergy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = "energy")
@PropertySource("classpath:application.properties")
public class Configuration {


}
