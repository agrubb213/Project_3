package com.Grubb.week11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 014291 on 2/13/2019.
 * Creates an object "task" that gives it a ID of task, task name, task description, and priority number.
 */

public class Task implements Comparable<Task>{
    public String taskName;
    public String taskDes;
    public int taskPri;
    public int id;
    public String strPri = Integer.toString(taskPri);




    /**
     * create task
     * @param taskName the name of object
     * @param taskDes the description of the object
     * @param taskPri the priority of the
     */
    public Task(String taskName, String taskDes, int taskPri, int id) {
        this.taskName = taskName;
        this.taskDes = taskDes;
        this.taskPri = taskPri;
        this.id = id;
    }

    /**
     * get the id
     * @return the number associated with the task.
     */
    public int getId(){
        return id;
    }

    /**
     * make the id
     * @param id set the number associated with the task.
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * get the task name
     * @return the name of the object (task name)
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * get the task description
     * @return the description of object(task)
     */
    public String getTaskDes() {
        return taskDes;
    }

    /**
     * get the priority
     * @return the priority of the object(task)
     */
    public int getTaskPri() {
        return taskPri;
    }

    public void toDisplay(){
        System.out.println(taskName+"\n Description: "+  taskDes + "\n Priority: " + taskPri);
    }

    @Override
    public int compareTo(Task o) {
        if(taskPri != o.taskPri){
            if (taskPri > o.taskPri){
                return -1;
            }else{return 1;}
        }
        return taskName.compareTo(o.taskName);
    }
}

