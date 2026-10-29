package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25206a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.h f25207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25208d;

    public r(String str, int i10, m7.h hVar, boolean z10) {
        this.f25206a = str;
        this.b = i10;
        this.f25207c = hVar;
        this.f25208d = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.r(h0Var, bVar, this);
    }

    public String b() {
        return this.f25206a;
    }

    public m7.h c() {
        return this.f25207c;
    }

    public boolean d() {
        return this.f25208d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f25206a + ", index=" + this.b + '}';
    }
}
