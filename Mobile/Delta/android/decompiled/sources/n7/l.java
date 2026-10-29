package n7;

import android.graphics.PointF;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25188a;
    public final m7.o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.o<PointF, PointF> f25189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.b f25190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25191e;

    public l(String str, m7.o<PointF, PointF> oVar, m7.o<PointF, PointF> oVar2, m7.b bVar, boolean z10) {
        this.f25188a = str;
        this.b = oVar;
        this.f25189c = oVar2;
        this.f25190d = bVar;
        this.f25191e = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.o(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.f25190d;
    }

    public String c() {
        return this.f25188a;
    }

    public m7.o<PointF, PointF> d() {
        return this.b;
    }

    public m7.o<PointF, PointF> e() {
        return this.f25189c;
    }

    public boolean f() {
        return this.f25191e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.f25189c + '}';
    }
}
