package w9;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35696a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public b(@NonNull String str) {
        s.m(str, "Name must not be null");
        this.f35696a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.b.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f35696a);
        return threadNewThread;
    }
}
