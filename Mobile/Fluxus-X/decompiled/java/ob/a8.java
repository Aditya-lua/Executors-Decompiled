package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f27075a;
    public final /* synthetic */ hf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27076c;

    public a8(n8 n8Var, i0 i0Var, hf hfVar) {
        this.f27075a = i0Var;
        this.b = hfVar;
        Objects.requireNonNull(n8Var);
        this.f27076c = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f27075a;
        hf hfVar = this.b;
        n8 n8Var = this.f27076c;
        n8Var.D2(n8Var.E2(i0Var, hfVar), hfVar);
    }
}
