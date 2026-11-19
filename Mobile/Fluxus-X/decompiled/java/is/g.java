package is;

import androidx.p000lifecycle.l0;
import es.s6;
import hs.g1;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<g1.e> f19787a;

    public g(i<g1.e> iVar) {
        this.f19787a = iVar;
    }

    public static g a(i<g1.e> iVar) {
        return new g(iVar);
    }

    public static f c(l0 l0Var, s6.Input input, g1.e eVar) {
        return new f(l0Var, input, eVar);
    }

    public f b(l0 l0Var, s6.Input input) {
        return c(l0Var, input, this.f19787a.get());
    }
}
