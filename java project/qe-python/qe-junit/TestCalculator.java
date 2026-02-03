public class TestCalculator {
public class TestCalculator{
    private Calculator calculator;


    @BeforeEach
    public void setup(){
        calculator=new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(4,calculator.add(a:2,b:2));
    }
}
}
