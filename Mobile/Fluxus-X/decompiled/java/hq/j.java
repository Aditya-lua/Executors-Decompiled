package hq;

import fq.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<m> f18521a;

    public j(wt.i<m> iVar) {
        this.f18521a = iVar;
    }

    public static j a(wt.i<m> iVar) {
        return new j(iVar);
    }

    public static i c(m mVar, n1.Props props) {
        return new i(mVar, props);
    }

    public i b(n1.Props props) {
        return c(this.f18521a.get(), props);
    }
}
