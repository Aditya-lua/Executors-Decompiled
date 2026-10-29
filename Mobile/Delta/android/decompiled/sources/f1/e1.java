package f1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15839a;
    public final r0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f15841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0.d f15843f;

    public e1(r0 r0Var, long j10, u uVar, boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f15839a = atomicBoolean;
        p0.d dVarB = p0.d.b();
        this.f15843f = dVarB;
        this.b = r0Var;
        this.f15840c = j10;
        this.f15841d = uVar;
        this.f15842e = z10;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            dVarB.c("stop");
        }
    }

    public static e1 a(w wVar, long j10) {
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        return new e1(wVar.getRecorder(), j10, wVar.getOutputOptions(), wVar.getIsPersistent(), true);
    }

    public static e1 b(w wVar, long j10) {
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        return new e1(wVar.getRecorder(), j10, wVar.getOutputOptions(), wVar.getIsPersistent(), false);
    }

    public u c() {
        return this.f15841d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        f(0, null);
    }

    public long d() {
        return this.f15840c;
    }

    public void e() {
        close();
    }

    public final void f(int i10, Throwable th2) throws Throwable {
        this.f15843f.a();
        if (this.f15839a.getAndSet(true)) {
            return;
        }
        this.b.x0(this, i10, th2);
    }

    public void finalize() throws Throwable {
        try {
            this.f15843f.d();
            f(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
