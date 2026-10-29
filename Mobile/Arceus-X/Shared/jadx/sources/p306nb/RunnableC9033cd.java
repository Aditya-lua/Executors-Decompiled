package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.cd */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9033cd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f32826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9180ld f32827b;

    public RunnableC9033cd(C9180ld c9180ld, long j10) {
        this.f32826a = j10;
        Objects.requireNonNull(c9180ld);
        this.f32827b = c9180ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32827b.m36470r(this.f32826a);
    }
}
