package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f27763a;
    public final /* synthetic */ n8 b;

    public r7(n8 n8Var, i iVar) {
        this.f27763a = iVar;
        Objects.requireNonNull(n8Var);
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.b;
        n8Var.z2().E();
        i iVar = this.f27763a;
        if (iVar.f27447h.zza() == null) {
            n8Var.z2().l0(iVar);
        } else {
            n8Var.z2().j0(iVar);
        }
    }
}
