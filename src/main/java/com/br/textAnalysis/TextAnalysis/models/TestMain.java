package com.br.textAnalysis.TextAnalysis.models;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        String text = "TESTANDO palavra quantidade testando testando quantidade ola testando este palavra";

        Text textAnalysis = new Text(text);
        System.out.println(textAnalysis.aparicoes());
    }
}
