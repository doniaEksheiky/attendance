package com.example.attendence;

public class DoctorSubjectsChild {
    private String generate;
    private String report;
    private String students;

    public DoctorSubjectsChild(String generate, String report, String students) {
        this.generate = generate;
        this.report = report;
        this.students = students;
    }

    public String getGenerate() {
        return generate;
    }

    public void setGenerate(String generate) {
        this.generate = generate;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }
}
