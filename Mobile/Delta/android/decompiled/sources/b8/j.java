package b8;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
