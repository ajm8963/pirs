
import org.example.StepsMethod;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsMethodTest {

    @Test
    public void FirsMethodTest() {
           StepsMethod mockStepsMethod = Mockito.mock(StepsMethod.class);
        when(mockStepsMethod.FirsMethod()).thenReturn("https://www.pirsoilgas.ru/work/");
           String actualUrl = mockStepsMethod.FirsMethod();
           assertEquals(actualUrl,"https://www.pirsoilgas.ru/work/");
    }


    @Test
    public void SecondMethodTest() {
        StepsMethod mockStepsMethod = Mockito.mock(StepsMethod.class);
        when(mockStepsMethod.SecondMethod()).thenReturn("https://www.pirsoilgas.ru/work/infosystems/");
        String actualUrl = mockStepsMethod.SecondMethod();
        String correctUrl = "https://www.pirsoilgas.ru/work/infosystems/";
        assertEquals(actualUrl,correctUrl);
    }

    @Test
    public void LastMethodTest() {
        StepsMethod mockStepsMethod = Mockito.mock(StepsMethod.class);
        when(mockStepsMethod.LastMethod()).thenReturn("https://www.pirsoilgas.ru/work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot");
        String actualUrlLast = mockStepsMethod.LastMethod();
        String correctUrl = "https://www.pirsoilgas.ru/work/infosystems/korporativnaya-informatsionnaya-sistema-dlya-ohrani-truda-promishlennoy-bezopasnosti-i-proizvodstvennogo-kontrolya-kisot";
        assertEquals(actualUrlLast,correctUrl);
    }
}


