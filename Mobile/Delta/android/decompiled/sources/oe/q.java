package oe;

import ze.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f27368a;

    public q(j0.b bVar) {
        this.f27368a = bVar;
    }

    public static q b(p pVar) {
        return new q(pVar.n().a());
    }

    public synchronized p a() {
        return p.i(this.f27368a.build());
    }
}
