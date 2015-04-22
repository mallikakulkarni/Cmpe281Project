package edu.sjsu.projectcloud;

import java.util.Date;

/**
 * Created by mallika on 4/22/15.
 */
public class Sprint {
    private String sprintId;
    private Date startDate;
    private Date endDate;

    public Sprint(String sprintId, Date startDate, Date endDate) {
        this.sprintId = sprintId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
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
