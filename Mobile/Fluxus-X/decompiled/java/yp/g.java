package yp;

import androidx.p000lifecycle.l0;
import vp.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<e0.b> f38113a;

    public g(wt.i<e0.b> iVar) {
        this.f38113a = iVar;
    }

    public static g a(wt.i<e0.b> iVar) {
        return new g(iVar);
    }

    public static f c(l0 l0Var, e0.b bVar) {
        return new f(l0Var, bVar);
    }

    public f b(l0 l0Var) {
        return c(l0Var, this.f38113a.get());
    }
}
