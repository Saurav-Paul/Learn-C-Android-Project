package com.example.asus.learnc;

public class Global {
    private static Global instance=new Global();
    public static Global getInstance(){return instance;}
    public static void setInstance(Global instance){Global.instance=instance;}

    String problemId;

    public Global() {
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }
}
