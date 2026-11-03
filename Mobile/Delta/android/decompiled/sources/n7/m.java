package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26013a;
    public final m7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f26014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.n f26015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26016e;

    public m(String str, m7.b bVar, m7.b bVar2, m7.n nVar, boolean z10) {
        this.f26013a = str;
        this.b = bVar;
        this.f26014c = bVar2;
        this.f26015d = nVar;
        this.f26016e = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.p(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.b;
    }

    public String c() {
        return this.f26013a;
    }

    public m7.b d() {
        return this.f26014c;
    }

    public m7.n e() {
        return this.f26015d;
    }

    public boolean f() {
        return this.f26016e;
    }
}
