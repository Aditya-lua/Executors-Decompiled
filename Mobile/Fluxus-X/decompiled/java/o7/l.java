package o7;

import android.graphics.PointF;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26884a;
    public final n7.o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.o<PointF, PointF> f26885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.b f26886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26887e;

    public l(String str, n7.o<PointF, PointF> oVar, n7.o<PointF, PointF> oVar2, n7.b bVar, boolean z10) {
        this.f26884a = str;
        this.b = oVar;
        this.f26885c = oVar2;
        this.f26886d = bVar;
        this.f26887e = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.o(h0Var, bVar, this);
    }

    public n7.b b() {
        return this.f26886d;
    }

    public String c() {
        return this.f26884a;
    }

    public n7.o<PointF, PointF> d() {
        return this.b;
    }

    public n7.o<PointF, PointF> e() {
        return this.f26885c;
    }

    public boolean f() {
        return this.f26887e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.f26885c + '}';
    }
}
