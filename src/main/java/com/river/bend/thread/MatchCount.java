package com.river.bend.thread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MatchCount implements Callable<Integer> {

    private File directory;
    private String keyword;
    private ExecutorService pool;
    private int count;

    public MatchCount(File directory,String keyword, ExecutorService pool){
        this.directory = directory;
        this.keyword = keyword;
        this.pool = pool;
    }

    @Override
    public Integer call() throws Exception {
        count = 0;

        File[] files = directory.listFiles();

        List<Future<Integer>> results = new ArrayList<>();

        for(File file:files){

            if(file.isDirectory()) {
                MatchCount counter = new MatchCount(file, keyword, pool);
                Future<Integer> result = pool.submit(counter);
            }else{

            }
        }

        return null;
    }


}
