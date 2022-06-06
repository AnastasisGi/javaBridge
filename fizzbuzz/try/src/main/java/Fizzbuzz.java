import java.lang.reflect.Array;

public class Fizzbuzz {

    public String generate(Integer upto){
        String result="";

        if(upto==1){
            result+="1";

        } else {
            for (int i = 1; i <= upto ; i++) {
                if(i%3==0){

                    result+="FizzBuzz";

                }

            }


        }



        return result;




    }

}
