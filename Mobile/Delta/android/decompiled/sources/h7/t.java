package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import f7.h0;
import f7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f19192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f19193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f19194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19196u;

    public t(h0 h0Var, o7.b bVar, n7.s sVar) {
        super(h0Var, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f19192q = bVar;
        this.f19193r = sVar.h();
        this.f19194s = sVar.k();
        i7.a<Integer, Integer> aVarA = sVar.c().a();
        this.f19195t = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
    }

    @Override // h7.a, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.b) {
            this.f19195t.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19196u;
            if (aVar != null) {
                this.f19192q.H(aVar);
            }
            if (cVar == null) {
                this.f19196u = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19196u = qVar;
            qVar.a(this);
            this.f19192q.j(this.f19195t);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f19193r;
    }

    @Override // h7.a, h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f19194s) {
            return;
        }
        this.f19072i.setColor(((i7.b) this.f19195t).r());
        i7.a<ColorFilter, ColorFilter> aVar = this.f19196u;
        if (aVar != null) {
            this.f19072i.setColorFilter(aVar.h());
        }
        super.i(canvas, matrix, i10, bVar);
    }
}
