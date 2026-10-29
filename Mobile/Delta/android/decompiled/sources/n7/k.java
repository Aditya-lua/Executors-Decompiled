package n7;

import android.graphics.PointF;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25175a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f25176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.o<PointF, PointF> f25177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.b f25178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.b f25179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.b f25180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m7.b f25181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m7.b f25182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f25184k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25187a;

        a(int i10) {
            this.f25187a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f25187a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, m7.b bVar, m7.o<PointF, PointF> oVar, m7.b bVar2, m7.b bVar3, m7.b bVar4, m7.b bVar5, m7.b bVar6, boolean z10, boolean z11) {
        this.f25175a = str;
        this.b = aVar;
        this.f25176c = bVar;
        this.f25177d = oVar;
        this.f25178e = bVar2;
        this.f25179f = bVar3;
        this.f25180g = bVar4;
        this.f25181h = bVar5;
        this.f25182i = bVar6;
        this.f25183j = z10;
        this.f25184k = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.n(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.f25179f;
    }

    public m7.b c() {
        return this.f25181h;
    }

    public String d() {
        return this.f25175a;
    }

    public m7.b e() {
        return this.f25180g;
    }

    public m7.b f() {
        return this.f25182i;
    }

    public m7.b g() {
        return this.f25176c;
    }

    public m7.o<PointF, PointF> h() {
        return this.f25177d;
    }

    public m7.b i() {
        return this.f25178e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.f25183j;
    }

    public boolean l() {
        return this.f25184k;
    }
}
