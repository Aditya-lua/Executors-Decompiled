package sq;

import androidx.p000lifecycle.l0;
import mq.q5;
import tq.k2;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<k2.d> f31869a;

    public o(wt.i<k2.d> iVar) {
        this.f31869a = iVar;
    }

    public static o a(wt.i<k2.d> iVar) {
        return new o(iVar);
    }

    public static n c(l0 l0Var, q5.Input input, k2.d dVar) {
        return new n(l0Var, input, dVar);
    }

    public n b(l0 l0Var, q5.Input input) {
        return c(l0Var, input, this.f31869a.get());
    }
}
