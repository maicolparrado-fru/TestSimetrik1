package com.demo.utils;

public class Utils {

    public static int extractTotalResults(String resultsText) {
        // Extraer el número de resultados de una cadena como "About 123,000,000 results (0.45 seconds)"
        String[] words = resultsText.split(" ");
        String totalResultsString = words[2].replace(".", "");
        return Integer.parseInt(totalResultsString);
    }
}
