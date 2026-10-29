package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.d6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9043d6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f32838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9060e6 f32839b;

    public RunnableC9043d6(C9060e6 c9060e6, boolean z10) {
        this.f32838a = z10;
        Objects.requireNonNull(c9060e6);
        this.f32839b = c9060e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32839b.m36291c().m36567s0(this.f32838a);
    }
}
