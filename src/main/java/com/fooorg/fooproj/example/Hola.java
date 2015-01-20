package com.fooorg.fooproj.example;

import java.util.UUID;

public class Hola {
    public static String generateTag() {
       return String.format("[%s]", UUID.randomUUID());
    }
}
