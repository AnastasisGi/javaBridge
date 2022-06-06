import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {


    @Test
    void TestGeneratingUpToOne(){
        Fizzbuzz subject = new Fizzbuzz();
        String result = String.valueOf(subject.generate(1));
        assertEquals("1",result);
    }

    @Test
    void TestGeneratingUpToThree(){
        Fizzbuzz subject = new Fizzbuzz();
        String result  = subject.generate(3);
//        System.out.printf("RESULT",result);
        assertEquals("1,2,FizzBuzz", result);
    }

}
