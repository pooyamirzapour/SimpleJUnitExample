import org.junit.*;

import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void test()
    {
        System.out.print("test");
        MyMath myMath = new MyMath();
        Integer expected=6;
        Integer result = myMath.sum(4,2);
        assertEquals(expected, result);
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.print("\n");
        System.out.print("Before class");
        System.out.print("\n");
    }

    @Before
    public  void before()
    {
        System.out.print("\n");
        System.out.print("Before");
        System.out.print("\n");
    }

    @After
    public  void after()
    {
        System.out.print("\n");
        System.out.print("after");
        System.out.print("\n");

    }

    @AfterClass
    public static void afterClass()
    {
        System.out.print("\n");
        System.out.print("after class");
        System.out.print("\n");

    }


    @Test
    public void testCondition()
    {
        System.out.print("test condition");
        Boolean condition=true;
        assertTrue(condition);
//        assertFalse(condition);
//        assertNull(null);
//        assertNotNull(null);

    }

} 
