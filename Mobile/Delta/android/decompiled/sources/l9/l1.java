package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f23049c;

    public l1(w0 w0Var, sb.k kVar) {
        super(3, kVar);
        this.f23049c = w0Var;
    }

    @Override // l9.o1
    public final /* bridge */ /* synthetic */ void d(@NonNull z zVar, boolean z10) {
    }

    @Override // l9.r0
    public final boolean f(j0 j0Var) {
        return this.f23049c.f23099a.f();
    }

    @Override // l9.r0
    public final Feature[] g(j0 j0Var) {
        return this.f23049c.f23099a.c();
    }

    @Override // l9.i1
    public final void h(j0 j0Var) {
        this.f23049c.f23099a.d(j0Var.t(), this.b);
        k.a aVarB = this.f23049c.f23099a.b();
        if (aVarB != null) {
            j0Var.v().put(aVarB, this.f23049c);
        }
    }
}
