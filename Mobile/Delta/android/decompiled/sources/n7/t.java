package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26045a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f26046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.b f26047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.b f26048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26049f;

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

    public t(String str, a aVar, m7.b bVar, m7.b bVar2, m7.b bVar3, boolean z10) {
        this.f26045a = str;
        this.b = aVar;
        this.f26046c = bVar;
        this.f26047d = bVar2;
        this.f26048e = bVar3;
        this.f26049f = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.u(bVar, this);
    }

    public m7.b b() {
        return this.f26047d;
    }

    public String c() {
        return this.f26045a;
    }

    public m7.b d() {
        return this.f26048e;
    }

    public m7.b e() {
        return this.f26046c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f26049f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f26046c + ", end: " + this.f26047d + ", offset: " + this.f26048e + "}";
    }
}
