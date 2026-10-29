package nf;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nf.a0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9444a0 implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: b */
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler f33972b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f33972b.post(runnable);
    }
}
