package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import f7.h0;
import f7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f18705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f18706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i7.a<Integer, Integer> f18708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f18709u;

    public t(h0 h0Var, o7.b bVar, n7.s sVar) {
        super(h0Var, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f18705q = bVar;
        this.f18706r = sVar.h();
        this.f18707s = sVar.k();
        i7.a<Integer, Integer> aVarA = sVar.c().a();
        this.f18708t = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
    }

    @Override // h7.a, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.b) {
            this.f18708t.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f18709u;
            if (aVar != null) {
                this.f18705q.H(aVar);
            }
            if (cVar == null) {
                this.f18709u = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f18709u = qVar;
            qVar.a(this);
            this.f18705q.j(this.f18708t);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f18706r;
    }

    @Override // h7.a, h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f18707s) {
            return;
        }
        this.f18585i.setColor(((i7.b) this.f18708t).r());
        i7.a<ColorFilter, ColorFilter> aVar = this.f18709u;
        if (aVar != null) {
            this.f18585i.setColorFilter(aVar.h());
        }
        super.i(canvas, matrix, i10, bVar);
    }
}
