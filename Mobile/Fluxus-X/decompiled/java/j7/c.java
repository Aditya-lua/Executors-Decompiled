package j7;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class c implements j7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.b f20098a;
    public final j7.a.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7.a<Integer, Integer> f20099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f20101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f20102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f20103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f20104h;

    public class a extends u7.c<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u7.c f20105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f20106e;

        public a(c cVar, u7.c cVar2) {
            this.f20105d = cVar2;
            this.f20106e = cVar;
        }

        @Override // u7.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(u7.b<Float> bVar) {
            Float f10 = (Float) this.f20105d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(j7.a.b bVar, p7.b bVar2, r7.j jVar) {
        this.b = bVar;
        this.f20098a = bVar2;
        j7.a<Integer, Integer> aVarA = jVar.a().a();
        this.f20099c = aVarA;
        aVarA.a(this);
        bVar2.j(aVarA);
        d dVarA = jVar.d().a();
        this.f20100d = dVarA;
        dVarA.a(this);
        bVar2.j(dVarA);
        d dVarA2 = jVar.b().a();
        this.f20101e = dVarA2;
        dVarA2.a(this);
        bVar2.j(dVarA2);
        d dVarA3 = jVar.c().a();
        this.f20102f = dVarA3;
        dVarA3.a(this);
        bVar2.j(dVarA3);
        d dVarA4 = jVar.e().a();
        this.f20103g = dVarA4;
        dVarA4.a(this);
        bVar2.j(dVarA4);
    }

    @Override // j7.a.b
    public void a() {
        this.b.a();
    }

    public t7.b b(Matrix matrix, int i10) {
        float fR = this.f20101e.r() * 0.017453292f;
        float fFloatValue = this.f20102f.h().floatValue();
        double d10 = fR;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f20103g.h().floatValue();
        int iIntValue = this.f20099c.h().intValue();
        t7.b bVar = new t7.b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f20100d.h().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        bVar.k(matrix);
        if (this.f20104h == null) {
            this.f20104h = new Matrix();
        }
        this.f20098a.f28982x.f().invert(this.f20104h);
        bVar.k(this.f20104h);
        return bVar;
    }

    public void c(u7.c<Integer> cVar) {
        this.f20099c.o(cVar);
    }

    public void d(u7.c<Float> cVar) {
        this.f20101e.o(cVar);
    }

    public void e(u7.c<Float> cVar) {
        this.f20102f.o(cVar);
    }

    public void f(u7.c<Float> cVar) {
        if (cVar == null) {
            this.f20100d.o(null);
        } else {
            this.f20100d.o(new a(this, cVar));
        }
    }

    public void g(u7.c<Float> cVar) {
        this.f20103g.o(cVar);
    }
}
