package mf;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public enum a0 implements Executor {
    INSTANCE;


    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b.post(runnable);
    }
}
