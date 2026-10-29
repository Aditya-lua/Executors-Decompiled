package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.q9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9256q9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33389c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f33390d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9257qa f33391e;

    public RunnableC9256q9(C9257qa c9257qa, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f33387a = atomicReference;
        this.f33388b = str2;
        this.f33389c = str3;
        this.f33390d = z10;
        Objects.requireNonNull(c9257qa);
        this.f33391e = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33391e.f33067a.m36315J().m36891g0(this.f33387a, null, this.f33388b, this.f33389c, this.f33390d);
    }
}
