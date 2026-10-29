package n7;

import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25224a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f25225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.b f25226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.b f25227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25228f;

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
        this.f25224a = str;
        this.b = aVar;
        this.f25225c = bVar;
        this.f25226d = bVar2;
        this.f25227e = bVar3;
        this.f25228f = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.u(bVar, this);
    }

    public m7.b b() {
        return this.f25226d;
    }

    public String c() {
        return this.f25224a;
    }

    public m7.b d() {
        return this.f25227e;
    }

    public m7.b e() {
        return this.f25225c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f25228f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f25225c + ", end: " + this.f25226d + ", offset: " + this.f25227e + "}";
    }
}
