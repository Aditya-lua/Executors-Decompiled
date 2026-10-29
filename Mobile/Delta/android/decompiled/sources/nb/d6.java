package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25448a;
    public final /* synthetic */ e6 b;

    public d6(e6 e6Var, boolean z10) {
        this.f25448a = z10;
        Objects.requireNonNull(e6Var);
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().s0(this.f25448a);
    }
}
