package p462u9;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: u9.h */
/* JADX INFO: loaded from: classes.dex */
public class C11817h implements InterfaceC11814e {

    /* JADX INFO: renamed from: a */
    public static final C11817h f41570a = new C11817h();

    @NonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC11814e m44180c() {
        return f41570a;
    }

    @Override // p462u9.InterfaceC11814e
    /* JADX INFO: renamed from: a */
    public final long mo44175a() {
        return System.currentTimeMillis();
    }

    @Override // p462u9.InterfaceC11814e
    /* JADX INFO: renamed from: b */
    public final long mo44176b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p462u9.InterfaceC11814e
    public final long nanoTime() {
        return System.nanoTime();
    }
}
