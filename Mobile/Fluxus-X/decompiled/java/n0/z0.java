package n0;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements g0.c2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25270a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f25272d;

    public z0(long j10, int i10, Throwable th2) {
        this.f25271c = SystemClock.elapsedRealtime() - j10;
        this.b = i10;
        if (th2 instanceof j1.b) {
            this.f25270a = 2;
            this.f25272d = th2;
            return;
        }
        if (!(th2 instanceof g0.p1)) {
            this.f25270a = 0;
            this.f25272d = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.f25272d = th2;
        if (th2 instanceof g0.x) {
            this.f25270a = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.f25270a = 1;
        } else {
            this.f25270a = 0;
        }
    }

    @Override // g0.c2.b
    public int n() {
        return this.f25270a;
    }

    @Override // g0.c2.b
    public Throwable o() {
        return this.f25272d;
    }

    @Override // g0.c2.b
    public long p() {
        return this.f25271c;
    }
}
