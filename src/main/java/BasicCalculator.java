import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BasicCalculator
{
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);


    public  Long sum(Long number1,  Long number2)
    {
        logger.info("Summing {} + {}", number1, number2);
        return number1+number2;
    }

    public Long multi (Long number1, Long number2)
    {
        logger.info("Multiplicando {} * {}", number1, number2);
        return  number1*number2;
    }

    public Long restar (Long number1, Long number2)
    {
        logger.info("Restando {} - {}", number1, number2);
        return  number1-number2;
    }
    public int dividir (Long number1, Long number2)
    {
        var div = 0;

        try {
            div = (int) (number1 / number2);
            logger.info("Dividiendo {} / {}", number1, number2);
        }catch (ArithmeticException e)
        {
            System.out.println("No se puede divir por 0");
        }


        return div;
    }



}
