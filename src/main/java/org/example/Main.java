package org.example;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String text = "Merhaba JAVA, Merhaba robot dreams!!";
        HashSet<Character> uniqueChars = findUniqueChars(text);
        System.out.println("Benzersiz karakterler: " + uniqueChars);
    }

    public static HashSet<Character> findUniqueChars(String text) {
        HashSet<Character> uniqueChars = new HashSet<>();
        HashSet<Character> seenChars = new HashSet<>();
        HashSet<Character> repeatedChars = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Karakter daha önce görüldü mü kontrol et
            if (seenChars.contains(currentChar)) {
                // Eğer tekrar görüldüyse, benzersiz karakterlerden çıkar ve tekrar eden karakterlere ekle
                uniqueChars.remove(currentChar);
                repeatedChars.add(currentChar);
            } else if (!repeatedChars.contains(currentChar)) {
                // Eğer daha önce görülmediyse ve tekrar eden karakterler içinde de değilse, benzersiz karakterlere ekle
                uniqueChars.add(currentChar);
            }

            // Karakteri görülen karakterler listesine ekle
            seenChars.add(currentChar);
        }

        return uniqueChars;
    }
}



