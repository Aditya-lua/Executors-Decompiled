package hq;

import fq.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18522a;

    public k(j jVar) {
        this.f18522a = jVar;
    }

    public static wt.i<i.a> b(j jVar) {
        return wt.e.a(new k(jVar));
    }

    @Override // hq.i.a
    public i a(n1.Props props) {
        return this.f18522a.b(props);
    }
}
