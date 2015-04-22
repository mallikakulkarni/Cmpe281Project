package edu.sjsu.projectcloud;

import java.util.Date;
import java.util.List;

/**
 * Created by mallika on 4/22/15.
 */
public class Project {
    private String projectType;
    private String projectName;
    private List<User> users;
    private List<Sprint> sprints;
    private List<Task> task;
    private Date startDate;
    private Date endDate;

    public Project(String projectType, String projectName, List<User> users, List<Sprint> sprints, List<Task> task, Date startDate, Date endDate) {
        this.projectType = projectType;
        this.projectName = projectName;
        this.users = users;
        this.sprints = sprints;
        this.task = task;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
