package ru.tracker;

public class Defect {
    long id;
    String resume;
    String severity;
    String daysToFix;

    public Defect(long id, String resume, String severity, String daysToFix) {
        this.id = id;
        this.resume = resume;
        this.severity = severity;
        this.daysToFix = daysToFix;
    }
}