package com.stevens.java8;

import java.util.List;


public class TestLamda {

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    public static void main(String[] args) {

    }


    public static <T> void forEach(List<T> list, Consumer<T> c) {

    }
}
