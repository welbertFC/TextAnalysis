package com.br.textAnalysis.TextAnalysis.models;

public class TestMain {

    public static void main(String[] args) {
        String text = "TESTANDO palavra quantidade";

        Text textAnalysis = new Text(text);
        System.out.println(textAnalysis.word_frequency());
    }
}
