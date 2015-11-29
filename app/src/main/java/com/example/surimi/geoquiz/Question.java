package com.example.surimi.geoquiz;

/**
 * Created by surimi on 11/19/15.
 */
public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question (int textResId, boolean answerTrue){
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }
}
