package o7;

import android.graphics.PointF;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26811a;
    public final n7.o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.f f26812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26814e;

    public b(String str, n7.o<PointF, PointF> oVar, n7.f fVar, boolean z10, boolean z11) {
        this.f26811a = str;
        this.b = oVar;
        this.f26812c = fVar;
        this.f26813d = z10;
        this.f26814e = z11;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.f(h0Var, bVar, this);
    }

    public String b() {
        return this.f26811a;
    }

    public n7.o<PointF, PointF> c() {
        return this.b;
    }

    public n7.f d() {
        return this.f26812c;
    }

    public boolean e() {
        return this.f26814e;
    }

    public boolean f() {
        return this.f26813d;
    }
}
