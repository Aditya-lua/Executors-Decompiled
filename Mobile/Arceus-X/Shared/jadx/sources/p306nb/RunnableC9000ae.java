package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.ae */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9000ae implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9213ne f32695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9197me f32696b;

    public RunnableC9000ae(C9197me c9197me, C9213ne c9213ne) {
        this.f32695a = c9213ne;
        Objects.requireNonNull(c9197me);
        this.f32696b = c9197me;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9197me c9197me = this.f32696b;
        c9197me.m36571u0(this.f32695a);
        c9197me.m36498A0();
    }
}
