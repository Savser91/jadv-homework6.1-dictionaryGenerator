package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String words = "Rdfad Asd df erty qwerty Koaty jhui rest erty motad q agoka polka gel tjadf";

        Function<String, Set<String>> dictionary = a ->
                Arrays.stream(
                        a
                        .toLowerCase(Locale.ROOT)
                        .split(" "))
                        .collect(Collectors.toSet());

        System.out.println("Словарь: ");

        dictionary
                .apply(words)
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}
