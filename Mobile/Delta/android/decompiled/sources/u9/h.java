package u9;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f32094a = new h();

    @NonNull
    public static e c() {
        return f32094a;
    }

    @Override // u9.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // u9.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // u9.e
    public final long nanoTime() {
        return System.nanoTime();
    }
}
