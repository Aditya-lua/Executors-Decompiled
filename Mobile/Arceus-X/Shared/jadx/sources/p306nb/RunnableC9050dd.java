package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.dd */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9050dd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f32859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9180ld f32860b;

    public RunnableC9050dd(C9180ld c9180ld, long j10) {
        this.f32859a = j10;
        Objects.requireNonNull(c9180ld);
        this.f32860b = c9180ld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32860b.m36471s(this.f32859a);
    }
}
