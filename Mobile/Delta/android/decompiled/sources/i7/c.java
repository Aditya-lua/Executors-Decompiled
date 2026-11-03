package i7;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class c implements i7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f20412a;
    public final i7.a.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7.a<Integer, Integer> f20413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f20415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f20416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f20417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f20418h;

    public class a extends t7.c<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t7.c f20419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f20420e;

        public a(c cVar, t7.c cVar2) {
            this.f20419d = cVar2;
            this.f20420e = cVar;
        }

        @Override // t7.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(t7.b<Float> bVar) {
            Float f10 = (Float) this.f20419d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(i7.a.b bVar, o7.b bVar2, q7.j jVar) {
        this.b = bVar;
        this.f20412a = bVar2;
        i7.a<Integer, Integer> aVarA = jVar.a().a();
        this.f20413c = aVarA;
        aVarA.a(this);
        bVar2.j(aVarA);
        d dVarA = jVar.d().a();
        this.f20414d = dVarA;
        dVarA.a(this);
        bVar2.j(dVarA);
        d dVarA2 = jVar.b().a();
        this.f20415e = dVarA2;
        dVarA2.a(this);
        bVar2.j(dVarA2);
        d dVarA3 = jVar.c().a();
        this.f20416f = dVarA3;
        dVarA3.a(this);
        bVar2.j(dVarA3);
        d dVarA4 = jVar.e().a();
        this.f20417g = dVarA4;
        dVarA4.a(this);
        bVar2.j(dVarA4);
    }

    @Override // i7.a.b
    public void a() {
        this.b.a();
    }

    public s7.b b(Matrix matrix, int i10) {
        float fR = this.f20415e.r() * 0.017453292f;
        float fFloatValue = this.f20416f.h().floatValue();
        double d10 = fR;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f20417g.h().floatValue();
        int iIntValue = this.f20413c.h().intValue();
        s7.b bVar = new s7.b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f20414d.h().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        bVar.k(matrix);
        if (this.f20418h == null) {
            this.f20418h = new Matrix();
        }
        this.f20412a.f27811x.f().invert(this.f20418h);
        bVar.k(this.f20418h);
        return bVar;
    }

    public void c(t7.c<Integer> cVar) {
        this.f20413c.o(cVar);
    }

    public void d(t7.c<Float> cVar) {
        this.f20415e.o(cVar);
    }

    public void e(t7.c<Float> cVar) {
        this.f20416f.o(cVar);
    }

    public void f(t7.c<Float> cVar) {
        if (cVar == null) {
            this.f20414d.o(null);
        } else {
            this.f20414d.o(new a(this, cVar));
        }
    }

    public void g(t7.c<Float> cVar) {
        this.f20417g.o(cVar);
    }
}
