package v9;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34240a = new h();

    @NonNull
    public static e d() {
        return f34240a;
    }

    @Override // v9.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // v9.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // v9.e
    public final long c() {
        return System.nanoTime();
    }
}
