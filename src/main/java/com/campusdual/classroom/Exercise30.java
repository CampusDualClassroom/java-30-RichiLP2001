package com.campusdual.classroom;

public class Exercise30 {

    public static void divisionWithCustomException
            (int dividend, int divisor) throws DivisionByZeroException {
        if (divisor==0) {
            throw new DivisionByZeroException("NO PUEDE EJECUTAR UNA DIVISION POR 0");
        }else {
            int result = dividend / divisor;
            System.out.println("Resultado: " + result);
        }

    }


    public static void main(String[] args) {


        try {
            divisionWithCustomException(3,0);
        }catch (DivisionByZeroException e){

            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Programa sigue ejecutandose normalmente.");
    }
}
