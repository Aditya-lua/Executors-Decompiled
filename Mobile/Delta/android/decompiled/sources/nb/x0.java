package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26083a;
    public final /* synthetic */ y1 b;

    public x0(y1 y1Var, long j10) {
        this.f26083a = j10;
        Objects.requireNonNull(y1Var);
        this.b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n(this.f26083a);
    }
}
