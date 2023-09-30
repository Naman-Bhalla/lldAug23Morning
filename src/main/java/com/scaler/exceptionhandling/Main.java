package com.scaler.exceptionhandling;

import java.io.NotActiveException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Doer doer = new Doer();
//        Database db = new Database(url);
//        doer.doSomething();

        try {
            System.out.println("Before find student by id");
            doer.findStudentByRollNumber(12);
            System.out.println("After find student by id");
            return;
        }  catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class was not found");
            throw classNotFoundException;
        } catch (NotActiveException notActiveException) {
            System.out.println("Student was not active");
        } catch (EvenNumberException evenNumberException) {
            System.out.println("Even number exception happened");
        } catch (Exception exception) {
            System.out.println("exception was thrown");
        } finally {
            System.out.println("I tried to call findStudentByRollNumber"); // must get executed
        }

        // Only check for the first catch block that matches the error
        System.out.println("Outside try catch");

//        try {
//            doer.findStudentByRollNumber(12);
//        }
//        catch (ClassNotFoundException exception) {
//            System.out.println("Student doesn't exist");
//        }
//        catch (EvenNumberException exception) {
//            System.out.println("Oops an even number has happened");
//        }
//        catch (NotActiveException notActiveException) {
//            System.out.println("Not active exception thrown");
//        }

    }
}
