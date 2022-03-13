package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String words = "Rdfad Asd df erty qwerty Koaty jhui rest motad q agoka polka gel tjadf";

        Function<String, List<String>> dictionary = a ->
                Arrays.stream(
                        a
                        .toLowerCase(Locale.ROOT)
                        .split(" "))
                        .collect(Collectors.toList());

        System.out.println("Словарь: ");

        dictionary
                .apply(words)
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}
