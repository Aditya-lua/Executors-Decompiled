package o7;

import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26888a;
    public final n7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.b f26889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.n f26890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26891e;

    public m(String str, n7.b bVar, n7.b bVar2, n7.n nVar, boolean z10) {
        this.f26888a = str;
        this.b = bVar;
        this.f26889c = bVar2;
        this.f26890d = nVar;
        this.f26891e = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.p(h0Var, bVar, this);
    }

    public n7.b b() {
        return this.b;
    }

    public String c() {
        return this.f26888a;
    }

    public n7.b d() {
        return this.f26889c;
    }

    public n7.n e() {
        return this.f26890d;
    }

    public boolean f() {
        return this.f26891e;
    }
}
