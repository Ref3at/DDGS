package com.ddgs.Quiz;

/**
 * Created by m on 2/22/16.
 */
public abstract class Quiz {

    private int chapterNumber , quizNumber, img_id;
    private String question ,rightAnswer;
    private String choosenAnswer;
    private String[] answers;

    boolean isTrue;

    Quiz(){
        this(0, 0);
    }



    // Todo: how many answers
    public Quiz(int chapterNumber, int quizNumber){
        this.chapterNumber=chapterNumber;
        this.quizNumber=quizNumber;
        answers = new String[4];
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public void setQuizNumber(int quizNumber) {
        this.quizNumber = quizNumber;
    }

    public int getQuizNumber() {
        return quizNumber;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.choosenAnswer = chosenAnswer;
    }

    public String getChosenAnswer() {
        return choosenAnswer;
    }
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public boolean IsTrueAns(){
        if (choosenAnswer==rightAnswer){
            return true;
        }else {
            return false;
        }
    }
}
