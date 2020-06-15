package com.thoughtworks;

public class FizzBuzz {
    public String say(int number){
        String result = "";
        if (number % 3 ==0){
            result=   result+"Fizz";
        }
        if (number % 5 ==0){
            result= result+"Buzz";
        }
        if (number % 7 ==0){
            result= result+"Whizz";
        }
        if (result ==""){
            result = ""+number;
        }

        if (String.valueOf(number).contains("3")){
            result=   "Fizz";
            return result;
        }
        return result ;
    }
}
