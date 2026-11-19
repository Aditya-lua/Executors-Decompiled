package o7;

import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26902a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.h f26903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26904d;

    public r(String str, int i10, n7.h hVar, boolean z10) {
        this.f26902a = str;
        this.b = i10;
        this.f26903c = hVar;
        this.f26904d = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.r(h0Var, bVar, this);
    }

    public String b() {
        return this.f26902a;
    }

    public n7.h c() {
        return this.f26903c;
    }

    public boolean d() {
        return this.f26904d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f26902a + ", index=" + this.b + '}';
    }
}
