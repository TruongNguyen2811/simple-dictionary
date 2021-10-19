package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author afkda
 */
public class libraryModel {

    private int id;
    public String word;
    public String mean;
    public String pronunciation;
    public String audiolink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getPronunciation() {
        return pronunciation;

    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getAudiolink() {
        return audiolink;
    }

    public void setAudiolink(String audiolink) {
        this.audiolink = audiolink;
    }

    public libraryModel() {
    }

    public libraryModel(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public libraryModel(String word, String mean, String pronunciation) {
        this.word = word;
        this.mean = mean;
        this.pronunciation = pronunciation;
    }

    public libraryModel(String word, String mean, String pronunciation, String audiolink) {
        this.word = word;
        this.mean = mean;
        this.pronunciation = pronunciation;
        this.audiolink = audiolink;

    }

}
