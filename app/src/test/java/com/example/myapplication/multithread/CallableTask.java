package com.example.myapplication.multithread;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
