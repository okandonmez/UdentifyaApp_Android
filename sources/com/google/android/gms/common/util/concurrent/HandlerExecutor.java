package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public class HandlerExecutor implements Executor {
    private final Handler handler;

    public HandlerExecutor(Handler handler) {
        this(handler.getLooper());
    }

    public HandlerExecutor(Looper looper) {
        this.handler = new Handler(looper);
    }

    public void execute(@NonNull Runnable runnable) {
        this.handler.post(runnable);
    }
}
