import energy.Bec;
import energy.BecSpecial;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ApplicationContext context = new
                AnnotationConfigApplicationContext(
                        Configuration.class);

       /* Energy solar =
                context.getBean("solar", Energy.class);
*/
        BecSpecial myBec = context.getBean(BecSpecial.class);

        myBec.getNivelEnergieDinBec();


    }
}
