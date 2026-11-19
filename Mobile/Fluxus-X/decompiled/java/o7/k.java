package o7;

import android.graphics.PointF;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26871a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.b f26872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.o<PointF, PointF> f26873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.b f26874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.b f26875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7.b f26876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n7.b f26877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n7.b f26878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26880k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26883a;

        a(int i10) {
            this.f26883a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f26883a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, n7.b bVar, n7.o<PointF, PointF> oVar, n7.b bVar2, n7.b bVar3, n7.b bVar4, n7.b bVar5, n7.b bVar6, boolean z10, boolean z11) {
        this.f26871a = str;
        this.b = aVar;
        this.f26872c = bVar;
        this.f26873d = oVar;
        this.f26874e = bVar2;
        this.f26875f = bVar3;
        this.f26876g = bVar4;
        this.f26877h = bVar5;
        this.f26878i = bVar6;
        this.f26879j = z10;
        this.f26880k = z11;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.n(h0Var, bVar, this);
    }

    public n7.b b() {
        return this.f26875f;
    }

    public n7.b c() {
        return this.f26877h;
    }

    public String d() {
        return this.f26871a;
    }

    public n7.b e() {
        return this.f26876g;
    }

    public n7.b f() {
        return this.f26878i;
    }

    public n7.b g() {
        return this.f26872c;
    }

    public n7.o<PointF, PointF> h() {
        return this.f26873d;
    }

    public n7.b i() {
        return this.f26874e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.f26879j;
    }

    public boolean l() {
        return this.f26880k;
    }
}
