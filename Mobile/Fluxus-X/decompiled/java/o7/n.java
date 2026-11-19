package o7;

import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26892a;
    public final n7.o<Float, Float> b;

    public n(String str, n7.o<Float, Float> oVar) {
        this.f26892a = str;
        this.b = oVar;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.q(h0Var, bVar, this);
    }

    public n7.o<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.f26892a;
    }
}
