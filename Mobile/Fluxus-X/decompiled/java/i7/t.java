package i7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import g7.h0;
import g7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p7.b f19262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f19263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f19264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j7.a<Integer, Integer> f19265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j7.a<ColorFilter, ColorFilter> f19266u;

    public t(h0 h0Var, p7.b bVar, o7.s sVar) {
        super(h0Var, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f19262q = bVar;
        this.f19263r = sVar.h();
        this.f19264s = sVar.k();
        j7.a<Integer, Integer> aVarA = sVar.c().a();
        this.f19265t = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
    }

    @Override // i7.a, i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (this.f19264s) {
            return;
        }
        this.f19142i.setColor(((j7.b) this.f19265t).r());
        j7.a<ColorFilter, ColorFilter> aVar = this.f19266u;
        if (aVar != null) {
            this.f19142i.setColorFilter(aVar.h());
        }
        super.d(canvas, matrix, i10, bVar);
    }

    @Override // i7.a, m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        super.e(t8, cVar);
        if (t8 == o0.b) {
            this.f19265t.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            j7.a<ColorFilter, ColorFilter> aVar = this.f19266u;
            if (aVar != null) {
                this.f19262q.I(aVar);
            }
            if (cVar == null) {
                this.f19266u = null;
                return;
            }
            j7.q qVar = new j7.q(cVar);
            this.f19266u = qVar;
            qVar.a(this);
            this.f19262q.j(this.f19265t);
        }
    }

    @Override // i7.c
    public String getName() {
        return this.f19263r;
    }
}
