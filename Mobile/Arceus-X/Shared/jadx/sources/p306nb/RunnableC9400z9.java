package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.z9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9400z9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9255q8 f33833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f33834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f33835c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9257qa f33836d;

    public RunnableC9400z9(C9257qa c9257qa, C9255q8 c9255q8, long j10, boolean z10) {
        this.f33833a = c9255q8;
        this.f33834b = j10;
        this.f33835c = z10;
        Objects.requireNonNull(c9257qa);
        this.f33836d = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f33836d;
        C9255q8 c9255q8 = this.f33833a;
        c9257qa.m36702o(c9255q8);
        c9257qa.m36685X(c9255q8, this.f33834b, true, this.f33835c);
    }
}
