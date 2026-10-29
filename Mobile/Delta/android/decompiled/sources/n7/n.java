package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25196a;
    public final m7.o<Float, Float> b;

    public n(String str, m7.o<Float, Float> oVar) {
        this.f25196a = str;
        this.b = oVar;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.q(h0Var, bVar, this);
    }

    public m7.o<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.f25196a;
    }
}
