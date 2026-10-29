package p028b8;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: b8.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1262j {
    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: a */
    public static Executor m7031a() {
        return new ExecutorC1265m(Executors.newSingleThreadExecutor());
    }
}
