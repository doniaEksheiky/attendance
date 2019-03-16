package com.example.attendence;

public class StudentSubjectsChild {
    private String scan;
    private String report;

    public StudentSubjectsChild(String scan, String report) {
        this.scan = scan;
        this.report = report;
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

}
