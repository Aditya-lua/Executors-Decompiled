package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.aa */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8996aa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9255q8 f32683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f32684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f32685c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9257qa f32686d;

    public RunnableC8996aa(C9257qa c9257qa, C9255q8 c9255q8, long j10, boolean z10) {
        this.f32683a = c9255q8;
        this.f32684b = j10;
        this.f32685c = z10;
        Objects.requireNonNull(c9257qa);
        this.f32686d = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f32686d;
        C9255q8 c9255q8 = this.f32683a;
        c9257qa.m36702o(c9255q8);
        c9257qa.m36685X(c9255q8, this.f32684b, false, this.f32685c);
    }
}
