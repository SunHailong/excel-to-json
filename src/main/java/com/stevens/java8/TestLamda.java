package com.stevens.java8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;


public class TestLamda {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        testMethodReference();
    }

    public static void test() {
        Callable<Integer> c = () -> 42;
        PrivilegedAction<Integer> p = () -> 42;


    }


    public static void testMethodReference() throws JsonProcessingException {
        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Compared list is " + objectMapper.writeValueAsString(str));
    }


    public static <T> void forEach(List<T> list, Consumer<T> c) {

    }
}
