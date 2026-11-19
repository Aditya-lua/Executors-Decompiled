package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf f27189a;
    public final /* synthetic */ hf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27190c;

    public d8(n8 n8Var, bf bfVar, hf hfVar) {
        this.f27189a = bfVar;
        this.b = hfVar;
        Objects.requireNonNull(n8Var);
        this.f27190c = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8 n8Var = this.f27190c;
        n8Var.z2().E();
        bf bfVar = this.f27189a;
        if (bfVar.zza() != null) {
            n8Var.z2().c0(bfVar, this.b);
        } else {
            hf hfVar = this.b;
            n8Var.z2().d0(bfVar.f27127g, hfVar);
        }
    }
}
