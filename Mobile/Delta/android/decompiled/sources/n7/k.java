package n7;

import android.graphics.PointF;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25996a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f25997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.o<PointF, PointF> f25998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.b f25999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.b f26000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.b f26001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m7.b f26002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m7.b f26003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26005k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26008a;

        a(int i10) {
            this.f26008a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f26008a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, m7.b bVar, m7.o<PointF, PointF> oVar, m7.b bVar2, m7.b bVar3, m7.b bVar4, m7.b bVar5, m7.b bVar6, boolean z10, boolean z11) {
        this.f25996a = str;
        this.b = aVar;
        this.f25997c = bVar;
        this.f25998d = oVar;
        this.f25999e = bVar2;
        this.f26000f = bVar3;
        this.f26001g = bVar4;
        this.f26002h = bVar5;
        this.f26003i = bVar6;
        this.f26004j = z10;
        this.f26005k = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.n(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.f26000f;
    }

    public m7.b c() {
        return this.f26002h;
    }

    public String d() {
        return this.f25996a;
    }

    public m7.b e() {
        return this.f26001g;
    }

    public m7.b f() {
        return this.f26003i;
    }

    public m7.b g() {
        return this.f25997c;
    }

    public m7.o<PointF, PointF> h() {
        return this.f25998d;
    }

    public m7.b i() {
        return this.f25999e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.f26004j;
    }

    public boolean l() {
        return this.f26005k;
    }
}
