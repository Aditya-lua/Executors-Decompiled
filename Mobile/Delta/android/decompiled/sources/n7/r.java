package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26027a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.h f26028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26029d;

    public r(String str, int i10, m7.h hVar, boolean z10) {
        this.f26027a = str;
        this.b = i10;
        this.f26028c = hVar;
        this.f26029d = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.r(h0Var, bVar, this);
    }

    public String b() {
        return this.f26027a;
    }

    public m7.h c() {
        return this.f26028c;
    }

    public boolean d() {
        return this.f26029d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f26027a + ", index=" + this.b + '}';
    }
}
