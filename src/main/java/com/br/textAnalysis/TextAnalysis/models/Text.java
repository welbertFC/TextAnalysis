package com.br.textAnalysis.TextAnalysis.models;

import lombok.Data;

import java.io.Serializable;
import java.util.*;

@Data
public class Text implements Serializable {

    private String text;

    public Text(String text) {
        this.text = text.toLowerCase(Locale.ROOT);
    }


    public Map<String, Integer> aparicoes(){
        String[] textoSeparado = text.split(" ");
        Map<String, Integer> vezesQueAparece = new HashMap<>();
        for (String palavra : textoSeparado){
            if (palavra == palavra){
                vezesQueAparece.compute(palavra, (k, v)  -> v == null ? 1 : v+1);
            }
        }
        return vezesQueAparece;
    }

}
