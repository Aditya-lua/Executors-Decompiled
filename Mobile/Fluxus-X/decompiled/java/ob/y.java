package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f27982a;
    public final /* synthetic */ z b;

    public y(z zVar, q8 q8Var) {
        this.f27982a = q8Var;
        Objects.requireNonNull(zVar);
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q8 q8Var = this.f27982a;
        q8Var.c();
        if (f.a()) {
            q8Var.b().t(this);
            return;
        }
        z zVar = this.b;
        boolean zC = zVar.c();
        zVar.e(0L);
        if (zC) {
            zVar.a();
        }
    }
}
