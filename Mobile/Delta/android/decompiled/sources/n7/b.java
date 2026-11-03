package n7;

import android.graphics.PointF;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25936a;
    public final m7.o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.f f25937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25939e;

    public b(String str, m7.o<PointF, PointF> oVar, m7.f fVar, boolean z10, boolean z11) {
        this.f25936a = str;
        this.b = oVar;
        this.f25937c = fVar;
        this.f25938d = z10;
        this.f25939e = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.f(h0Var, bVar, this);
    }

    public String b() {
        return this.f25936a;
    }

    public m7.o<PointF, PointF> c() {
        return this.b;
    }

    public m7.f d() {
        return this.f25937c;
    }

    public boolean e() {
        return this.f25939e;
    }

    public boolean f() {
        return this.f25938d;
    }
}
