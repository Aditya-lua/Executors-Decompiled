package p115f1;

import java.util.concurrent.atomic.AtomicBoolean;
import p347p0.C10088d;
import p533x2.C12637g;

/* JADX INFO: renamed from: f1.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5251e1 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f20339a;

    /* JADX INFO: renamed from: b */
    public final C5289r0 f20340b;

    /* JADX INFO: renamed from: c */
    public final long f20341c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5297u f20342d;

    /* JADX INFO: renamed from: e */
    public final boolean f20343e;

    /* JADX INFO: renamed from: f */
    public final C10088d f20344f;

    public C5251e1(C5289r0 c5289r0, long j10, AbstractC5297u abstractC5297u, boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20339a = atomicBoolean;
        C10088d c10088dM38904b = C10088d.m38904b();
        this.f20344f = c10088dM38904b;
        this.f20340b = c5289r0;
        this.f20341c = j10;
        this.f20342d = abstractC5297u;
        this.f20343e = z10;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            c10088dM38904b.m38906c("stop");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5251e1 m24284a(C5303w c5303w, long j10) {
        C12637g.m47076h(c5303w, "The given PendingRecording cannot be null.");
        return new C5251e1(c5303w.getRecorder(), j10, c5303w.getOutputOptions(), c5303w.getIsPersistent(), true);
    }

    /* JADX INFO: renamed from: b */
    public static C5251e1 m24285b(C5303w c5303w, long j10) {
        C12637g.m47076h(c5303w, "The given PendingRecording cannot be null.");
        return new C5251e1(c5303w.getRecorder(), j10, c5303w.getOutputOptions(), c5303w.getIsPersistent(), false);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC5297u m24286c() {
        return this.f20342d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m24289f(0, null);
    }

    /* JADX INFO: renamed from: d */
    public long m24287d() {
        return this.f20341c;
    }

    /* JADX INFO: renamed from: e */
    public void m24288e() {
        close();
    }

    /* JADX INFO: renamed from: f */
    public final void m24289f(int i10, Throwable th2) throws Throwable {
        this.f20344f.m38905a();
        if (this.f20339a.getAndSet(true)) {
            return;
        }
        this.f20340b.m24511x0(this, i10, th2);
    }

    public void finalize() throws Throwable {
        try {
            this.f20344f.m38907d();
            m24289f(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
