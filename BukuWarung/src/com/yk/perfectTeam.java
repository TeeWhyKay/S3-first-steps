package com.yk;

import java.util.Collections;
import java.util.HashMap;

public class perfectTeam {
    public static void main(String[] args) {
        String skills = "pcmbzpcmbz";
        char[] ch = skills.toCharArray();
        HashMap<Character, Integer> skillCounter = new HashMap<Character, Integer>();
        System.out.println(ch);
        for (char c:ch) {
            if (skillCounter.containsKey(c)) skillCounter.put(c, skillCounter.get(c) + 1);
            else skillCounter.put(c, 1);
        }
        System.out.println(Collections.min(skillCounter.values()));
    }

}
