package mp;

import androidx.p000lifecycle.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<j.c> f23485a;

    public n(wt.i<j.c> iVar) {
        this.f23485a = iVar;
    }

    public static n a(wt.i<j.c> iVar) {
        return new n(iVar);
    }

    public static m c(l0 l0Var, j.c cVar) {
        return new m(l0Var, cVar);
    }

    public m b(l0 l0Var) {
        return c(l0Var, this.f23485a.get());
    }
}
