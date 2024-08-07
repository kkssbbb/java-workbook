package org.workbook.answer.Chapter10.P201_SimpleExecutor.src.modern.challenge;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        (new Thread(r)).start();
    }

}
