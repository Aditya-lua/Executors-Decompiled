package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.a f23058c;

    public n1(k.a aVar, sb.k kVar) {
        super(4, kVar);
        this.f23058c = aVar;
    }

    @Override // l9.o1
    public final /* bridge */ /* synthetic */ void d(@NonNull z zVar, boolean z10) {
    }

    @Override // l9.r0
    public final boolean f(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().get(this.f23058c);
        return w0Var != null && w0Var.f23099a.f();
    }

    @Override // l9.r0
    public final Feature[] g(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().get(this.f23058c);
        if (w0Var == null) {
            return null;
        }
        return w0Var.f23099a.c();
    }

    @Override // l9.i1
    public final void h(j0 j0Var) {
        w0 w0Var = (w0) j0Var.v().remove(this.f23058c);
        if (w0Var == null) {
            this.b.e(Boolean.FALSE);
            return;
        }
        w0Var.b.b(j0Var.t(), this.b);
        w0Var.f23099a.a();
    }
}
