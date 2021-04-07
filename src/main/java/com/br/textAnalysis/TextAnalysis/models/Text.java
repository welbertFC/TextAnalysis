package com.br.textAnalysis.TextAnalysis.models;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Data
public class Text implements Serializable {

    private String text;

    public Text(String text) {
        this.text = text.toLowerCase(Locale.ROOT);
    }

    public Map<String, Integer> word_frequency(){
        Map<String,Integer> quantas = new HashMap<String,Integer>();
        String s = "";
        String[] aparicoes = s.split(text);
       quantas.get(aparicoes);
       for (String palavra : aparicoes){
           quantas.compute(palavra, (k,v) -> v == null ? 1 : v+1);

       }
       return quantas;
    }
}
