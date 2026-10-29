package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9359x0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f33625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9376y1 f33626b;

    public RunnableC9359x0(C9376y1 c9376y1, long j10) {
        this.f33625a = j10;
        Objects.requireNonNull(c9376y1);
        this.f33626b = c9376y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33626b.m37074n(this.f33625a);
    }
}
