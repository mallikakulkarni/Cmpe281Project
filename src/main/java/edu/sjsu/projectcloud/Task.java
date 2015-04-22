package edu.sjsu.projectcloud;

import java.util.Date;

/**
 * Created by mallika on 4/22/15.
 */
public class Task {
    private int taskID;
    private Date taskStartDate;
    private Date taskEndDate;

    public Task(int taskID, Date taskStartDate, Date taskEndDate) {
        this.taskID = taskID;
        this.taskStartDate = taskStartDate;
        this.taskEndDate = taskEndDate;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public Date getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(Date taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }
}
