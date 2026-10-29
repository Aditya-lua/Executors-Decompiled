package v9;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32879a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public b(@NonNull String str) {
        m.m(str, "Name must not be null");
        this.f32879a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.b.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f32879a);
        return threadNewThread;
    }
}
