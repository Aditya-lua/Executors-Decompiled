package p296n0;

import android.os.SystemClock;
import p140g0.C5923p1;
import p140g0.C5953x;
import p140g0.InterfaceC5872c2;

/* JADX INFO: renamed from: n0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8854z0 implements InterfaceC5872c2.b {

    /* JADX INFO: renamed from: a */
    public final int f32236a;

    /* JADX INFO: renamed from: b */
    public final int f32237b;

    /* JADX INFO: renamed from: c */
    public final long f32238c;

    /* JADX INFO: renamed from: d */
    public final Throwable f32239d;

    public C8854z0(long j10, int i10, Throwable th2) {
        this.f32238c = SystemClock.elapsedRealtime() - j10;
        this.f32237b = i10;
        if (th2 instanceof C8774j1.b) {
            this.f32236a = 2;
            this.f32239d = th2;
            return;
        }
        if (!(th2 instanceof C5923p1)) {
            this.f32236a = 0;
            this.f32239d = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.f32239d = th2;
        if (th2 instanceof C5953x) {
            this.f32236a = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.f32236a = 1;
        } else {
            this.f32236a = 0;
        }
    }

    @Override // p140g0.InterfaceC5872c2.b
    /* JADX INFO: renamed from: m */
    public int mo26319m() {
        return this.f32236a;
    }

    @Override // p140g0.InterfaceC5872c2.b
    /* JADX INFO: renamed from: n */
    public Throwable mo26320n() {
        return this.f32239d;
    }

    @Override // p140g0.InterfaceC5872c2.b
    /* JADX INFO: renamed from: o */
    public long mo26321o() {
        return this.f32238c;
    }
}
