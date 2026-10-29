package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25192a;
    public final m7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f25193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.n f25194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25195e;

    public m(String str, m7.b bVar, m7.b bVar2, m7.n nVar, boolean z10) {
        this.f25192a = str;
        this.b = bVar;
        this.f25193c = bVar2;
        this.f25194d = nVar;
        this.f25195e = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.p(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.b;
    }

    public String c() {
        return this.f25192a;
    }

    public m7.b d() {
        return this.f25193c;
    }

    public m7.n e() {
        return this.f25194d;
    }

    public boolean f() {
        return this.f25195e;
    }
}
