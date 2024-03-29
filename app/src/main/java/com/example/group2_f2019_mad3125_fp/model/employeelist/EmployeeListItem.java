package com.example.group2_f2019_mad3125_fp.model.employeelist;

public class EmployeeListItem {
    private String title;
    private String description;

    public EmployeeListItem(String title, String description)
    {
        super();
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
