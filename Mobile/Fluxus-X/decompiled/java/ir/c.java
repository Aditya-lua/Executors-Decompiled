package ir;

import av.p0;
import dr.e;
import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<e> f19756a;
    public final i<to.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f19757c;

    public c(i<e> iVar, i<to.e> iVar2, i<p0> iVar3) {
        this.f19756a = iVar;
        this.b = iVar2;
        this.f19757c = iVar3;
    }

    public static c a(i<e> iVar, i<to.e> iVar2, i<p0> iVar3) {
        return new c(iVar, iVar2, iVar3);
    }

    public static b c(e eVar, to.e eVar2, p0 p0Var) {
        return new b(eVar, eVar2, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f19756a.get(), this.b.get(), this.f19757c.get());
    }
}
