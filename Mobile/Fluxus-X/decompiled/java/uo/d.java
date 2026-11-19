package uo;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<to.e> f33793a;
    public final i<b> b;

    public d(i<to.e> iVar, i<b> iVar2) {
        this.f33793a = iVar;
        this.b = iVar2;
    }

    public static d a(i<to.e> iVar, i<b> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(String str, to.e eVar, b bVar) {
        return new c(str, eVar, bVar);
    }

    public c b(String str) {
        return c(str, this.f33793a.get(), this.b.get());
    }
}
