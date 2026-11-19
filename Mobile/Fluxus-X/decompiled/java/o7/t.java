package o7;

import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26920a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.b f26921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.b f26922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.b f26923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26924f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, n7.b bVar, n7.b bVar2, n7.b bVar3, boolean z10) {
        this.f26920a = str;
        this.b = aVar;
        this.f26921c = bVar;
        this.f26922d = bVar2;
        this.f26923e = bVar3;
        this.f26924f = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.u(bVar, this);
    }

    public n7.b b() {
        return this.f26922d;
    }

    public String c() {
        return this.f26920a;
    }

    public n7.b d() {
        return this.f26923e;
    }

    public n7.b e() {
        return this.f26921c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f26924f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f26921c + ", end: " + this.f26922d + ", offset: " + this.f26923e + "}";
    }
}
