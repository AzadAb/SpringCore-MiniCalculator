import com.azad.Calculator.Serivice.CalculatorSevrvice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");


        CalculatorSevrvice con = (CalculatorSevrvice) context.getBean("calculatorservice");


        con.Calculate();

        context.close();
    }
}
