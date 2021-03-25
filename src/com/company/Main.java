package com.company;

public class Main {
    static void fisrtExercise() {
        System.out.println("Hello , Pavel!");
        System.out.println("_______________________");
    }
    static void secondExercise() {
        System.out.println("Cats are robots!");
        System.out.println("_______________________");
    }
    static void thirdExercise() {
        for (int i = 0 ; i <= 5 ; i++ ) {
            System.out.println("i = " + i);
        }
        System.out.println("_______________________");
    }
    static void fourthExercise() {
        String allLines = "WE NEED TO";
        String emptyLine = " ";
        System.out.println(allLines);
        System.out.println(emptyLine);
            allLines = "LEARN JAVA";
        System.out.println(allLines);
        System.out.println(emptyLine);
            allLines = "AS QUICKLY AS POSSIBLE";
        System.out.println(allLines);
        System.out.println("_______________________");
    }
    static void fifthExercise() {
        String tic = " O ";
        String tac = " X ";
        System.out.println(tic + tac + tac);
        System.out.println(tic + tac + tic);
        System.out.println(tac + tic + tac);
        System.out.println("_______________________");
    }
    public static void main(String[] args) {
        System.out.println("First exercise : \n");
	        fisrtExercise();
        System.out.println("Second exercise : \n");
            secondExercise();
        System.out.println("Third exercise : \n");
            thirdExercise();
        System.out.println("Fourth exercise : \n");
            fourthExercise();
        System.out.println("Fifth exercise : \n");
            fifthExercise();
    }
}
