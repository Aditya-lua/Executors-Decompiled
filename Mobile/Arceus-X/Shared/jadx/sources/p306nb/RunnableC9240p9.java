package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.p9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9240p9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33350c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9257qa f33351d;

    public RunnableC9240p9(C9257qa c9257qa, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f33348a = atomicReference;
        this.f33349b = str2;
        this.f33350c = str3;
        Objects.requireNonNull(c9257qa);
        this.f33351d = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33351d.f33067a.m36315J().m36889e0(this.f33348a, null, this.f33349b, this.f33350c);
    }
}
