package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.x9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9368x9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean f33656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33657b;

    public RunnableC9368x9(C9257qa c9257qa, Boolean bool) {
        this.f33656a = bool;
        Objects.requireNonNull(c9257qa);
        this.f33657b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33657b.m36684W(this.f33656a, true);
    }
}
