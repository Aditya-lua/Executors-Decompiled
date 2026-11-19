package m9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f23034c;

    public l1(w0 w0Var, tb.k kVar) {
        super(3, kVar);
        this.f23034c = w0Var;
    }

    @Override // m9.o1
    public final /* bridge */ /* synthetic */ void d(@NonNull z zVar, boolean z10) {
    }

    @Override // m9.r0
    public final boolean f(j0 j0Var) {
        return this.f23034c.f23084a.f();
    }

    @Override // m9.r0
    public final k9.d[] g(j0 j0Var) {
        return this.f23034c.f23084a.c();
    }

    @Override // m9.i1
    public final void h(j0 j0Var) {
        this.f23034c.f23084a.d(j0Var.t(), this.b);
        k.a aVarB = this.f23034c.f23084a.b();
        if (aVarB != null) {
            j0Var.v().put(aVarB, this.f23034c);
        }
    }
}
