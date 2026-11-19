package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v8 f27324a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va f27326d;

    public fa(va vaVar, v8 v8Var, long j10, boolean z10) {
        this.f27324a = v8Var;
        this.b = j10;
        this.f27325c = z10;
        Objects.requireNonNull(vaVar);
        this.f27326d = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.f27326d;
        v8 v8Var = this.f27324a;
        vaVar.o(v8Var);
        vaVar.X(v8Var, this.b, false, this.f27325c);
    }
}
