package m9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.a f23043c;

    public n1(k.a aVar, tb.k kVar) {
        super(4, kVar);
        this.f23043c = aVar;
    }

    @Override // m9.o1
    public final /* bridge */ /* synthetic */ void d(@NonNull z zVar, boolean z10) {
    }

    @Override // m9.r0
    public final boolean f(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().get(this.f23043c);
        return w0Var != null && w0Var.f23084a.f();
    }

    @Override // m9.r0
    public final k9.d[] g(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().get(this.f23043c);
        if (w0Var == null) {
            return null;
        }
        return w0Var.f23084a.c();
    }

    @Override // m9.i1
    public final void h(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().remove(this.f23043c);
        if (w0Var == null) {
            this.b.e(Boolean.FALSE);
            return;
        }
        w0Var.b.b(j0Var.t(), this.b);
        w0Var.f23084a.a();
    }
}
