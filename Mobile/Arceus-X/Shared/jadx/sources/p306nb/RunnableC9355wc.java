package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.wc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9355wc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9197me f33615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f33616b;

    public RunnableC9355wc(C9016bd c9016bd, C9197me c9197me, Runnable runnable) {
        this.f33615a = c9197me;
        this.f33616b = runnable;
        Objects.requireNonNull(c9016bd);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9197me c9197me = this.f33615a;
        c9197me.m36505E();
        c9197me.m36503D(this.f33616b);
        c9197me.m36564r();
    }
}
