package com.example.quizing;

import java.io.Serializable;

public class inputs implements Serializable {
    private int questionindex;
    private String whichoption;

    public int getOptionindex() {
        return optionindex;
    }

    public void setOptionindex(int optionindex) {
        this.optionindex = optionindex;
    }

    private int optionindex;


    public int getQuestionindex() {
        return questionindex;
    }

    public void setQuestionindex(int questionindex) {
        this.questionindex = questionindex;
    }

    public String getWhichoption() {
        return whichoption;
    }

    public void setWhichoption(String optionindex) {
        this.whichoption = optionindex;
    }
}
