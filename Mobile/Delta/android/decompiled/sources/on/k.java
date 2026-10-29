package on;

import qn.s;

/* JADX INFO: loaded from: classes3.dex */
public class k implements sn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f27544a;
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn.h f27545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27546d = false;

    public enum a {
        WRAP,
        REPLACE
    }

    public k(a aVar, s sVar, sn.h hVar) {
        this.f27544a = aVar;
        this.b = sVar;
        this.f27545c = hVar;
    }

    @Override // sn.f
    public sn.f b() {
        this.f27546d = true;
        return this;
    }

    public s d() {
        return this.b;
    }

    public sn.h e() {
        return this.f27545c;
    }

    public a f() {
        return this.f27544a;
    }

    public boolean g() {
        return this.f27546d;
    }
}
