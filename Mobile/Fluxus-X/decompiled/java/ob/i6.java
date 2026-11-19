package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27464a;
    public final /* synthetic */ j6 b;

    public i6(j6 j6Var, boolean z10) {
        this.f27464a = z10;
        Objects.requireNonNull(j6Var);
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().s0(this.f27464a);
    }
}
