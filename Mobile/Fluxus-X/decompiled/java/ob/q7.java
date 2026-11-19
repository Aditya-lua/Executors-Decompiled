package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f27738a;
    public final /* synthetic */ hf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27739c;

    public q7(n8 n8Var, i iVar, hf hfVar) {
        this.f27738a = iVar;
        this.b = hfVar;
        Objects.requireNonNull(n8Var);
        this.f27739c = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.f27739c;
        n8Var.z2().E();
        i iVar = this.f27738a;
        if (iVar.f27447h.zza() == null) {
            n8Var.z2().m0(iVar, this.b);
        } else {
            n8Var.z2().k0(iVar, this.b);
        }
    }
}
