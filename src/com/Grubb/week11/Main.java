package com.Grubb.week11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 014291 on 2/13/2019.
 */
/*
2/26/2019
Austin J. Grubb
Program give you a list of options to use to manipulate a task list.
 */
public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Task> taskList = new ArrayList<>();
    static TaskList list = new TaskList();

    static boolean whatTask() {
        //Ask the user what option they would like and then directs you to the right method to use.

        String whichTask;
        boolean exit = false;

        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) list all task.\n" +
                "(3) list all task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        whichTask = scan.nextLine();

        switch (whichTask) {
            // using the input directs you to the right method/ class to use.

            case "1":
                list.addTask();
                break;

            case "2":
                list.listTask();
                // list the task then removes the right task

                break;

            case "3":
                list.listTask();
                //list the task then remove the task

                break;

            case "4":
                list.listTask();
                //list task

                break;

            case "0":
                // exit code
                exit = true;
                break;

            default:
                // checking for valid input
                System.out.println("Not a valid input!");
                break;
        }
        return exit;
    }



    public static void main(String[] args) {
        //main
        boolean exit;
        do {
            // while whatTask has not exited then keep running it.
            exit = whatTask();
        } while (!exit);
    }
}