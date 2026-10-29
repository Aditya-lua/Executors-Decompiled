package h7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import f7.h0;
import f7.o0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n implements m, i7.a.b, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f18663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7.k.a f18664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i7.a<?, Float> f18667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i7.a<?, PointF> f18668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i7.a<?, Float> f18669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i7.a<?, Float> f18670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i7.a<?, Float> f18671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i7.a<?, Float> f18672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i7.a<?, Float> f18673p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18675r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18659a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f18660c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f18661d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f18674q = new b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18676a;

        static {
            int[] iArr = new int[n7.k.a.values().length];
            f18676a = iArr;
            try {
                iArr[n7.k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18676a[n7.k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(h0 h0Var, o7.b bVar, n7.k kVar) {
        this.f18663f = h0Var;
        this.f18662e = kVar.d();
        n7.k.a aVarJ = kVar.j();
        this.f18664g = aVarJ;
        this.f18665h = kVar.k();
        this.f18666i = kVar.l();
        i7.d dVarA = kVar.g().a();
        this.f18667j = dVarA;
        i7.a<PointF, PointF> aVarA = kVar.h().a();
        this.f18668k = aVarA;
        i7.d dVarA2 = kVar.i().a();
        this.f18669l = dVarA2;
        i7.d dVarA3 = kVar.e().a();
        this.f18671n = dVarA3;
        i7.d dVarA4 = kVar.f().a();
        this.f18673p = dVarA4;
        n7.k.a aVar = n7.k.a.STAR;
        if (aVarJ == aVar) {
            this.f18670m = kVar.b().a();
            this.f18672o = kVar.c().a();
        } else {
            this.f18670m = null;
            this.f18672o = null;
        }
        bVar.j(dVarA);
        bVar.j(aVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        bVar.j(dVarA4);
        if (aVarJ == aVar) {
            bVar.j(this.f18670m);
            bVar.j(this.f18672o);
        }
        dVarA.a(this);
        aVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
        dVarA4.a(this);
        if (aVarJ == aVar) {
            this.f18670m.a(this);
            this.f18672o.a(this);
        }
    }

    private void k() {
        this.f18675r = false;
        this.f18663f.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        k();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == n7.t.a.SIMULTANEOUSLY) {
                    this.f18674q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.a<?, Float> aVar;
        i7.a<?, Float> aVar2;
        if (t8 == o0.f16441w) {
            this.f18667j.o(cVar);
            return;
        }
        if (t8 == o0.f16442x) {
            this.f18669l.o(cVar);
            return;
        }
        if (t8 == o0.f16432n) {
            this.f18668k.o(cVar);
            return;
        }
        if (t8 == o0.f16443y && (aVar2 = this.f18670m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t8 == o0.f16444z) {
            this.f18671n.o(cVar);
            return;
        }
        if (t8 == o0.A && (aVar = this.f18672o) != null) {
            aVar.o(cVar);
        } else if (t8 == o0.B) {
            this.f18673p.o(cVar);
        }
    }

    public final void f() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f18667j.h().floatValue());
        i7.a<?, Float> aVar = this.f18669l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f18673p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f18671n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f18659a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFH = this.f18668k.h();
                this.f18659a.offset(pointFH.x, pointFH.y);
                this.f18659a.close();
                return;
            }
            float fCos2 = (float) (d12 * Math.cos(d14));
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                f10 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f13 = fFloatValue2 * f10 * 0.25f;
                float f14 = f13 * fCos3;
                float f15 = f13 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f13;
                float fSin4 = f13 * ((float) Math.sin(dAtan3));
                if (d15 == d10 - 1.0d) {
                    this.b.reset();
                    this.b.moveTo(fCos, fSin);
                    float f16 = fCos - f14;
                    float f17 = fSin - f15;
                    float f18 = fCos2 + fCos4;
                    float f19 = fSin2 + fSin4;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f18660c.setPath(this.b, false);
                    PathMeasure pathMeasure = this.f18660c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f18661d, null);
                    Path path = this.f18659a;
                    float[] fArr = this.f18661d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f18659a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 != d10 - 1.0d) {
                    this.f18659a.lineTo(fCos, fSin);
                }
                i10++;
                dCeil = d10;
                fFloatValue = f10;
            }
            d14 += d13;
            i10++;
            dCeil = d10;
            fFloatValue = f10;
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f18662e;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f18675r) {
            return this.f18659a;
        }
        this.f18659a.reset();
        if (this.f18665h) {
            this.f18675r = true;
            return this.f18659a;
        }
        int i10 = a.f18676a[this.f18664g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            f();
        }
        this.f18659a.close();
        this.f18674q.b(this.f18659a);
        this.f18675r = true;
        return this.f18659a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    public final void j() {
        float f10;
        float f11;
        float fCos;
        float fSin;
        float f12;
        double d10;
        float f13;
        float f14;
        float f15;
        float fFloatValue = this.f18667j.h().floatValue();
        i7.a<?, Float> aVar = this.f18669l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d11);
        if (this.f18666i) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        if (f18 != 0.0f) {
            radians += (double) ((1.0f - f18) * f17);
        }
        float fFloatValue2 = this.f18671n.h().floatValue();
        float fFloatValue3 = this.f18670m.h().floatValue();
        i7.a<?, Float> aVar2 = this.f18672o;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        i7.a<?, Float> aVar3 = this.f18673p;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f18 != 0.0f) {
            f13 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            f11 = 0.0f;
            double d12 = f13;
            f10 = 2.0f;
            float fCos2 = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.f18659a.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f16 * f18) / 2.0f));
            fCos = fCos2;
            f12 = f17;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.f18659a.moveTo(fCos, fSin);
            f12 = f17;
            d10 = radians + ((double) f12);
            f13 = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        boolean z10 = false;
        double d14 = d10;
        float f19 = fSin;
        float f20 = fCos;
        double d15 = d14;
        while (true) {
            double d16 = i10;
            if (d16 >= dCeil) {
                PointF pointFH = this.f18668k.h();
                this.f18659a.offset(pointFH.x, pointFH.y);
                this.f18659a.close();
                return;
            }
            float f21 = z10 ? fFloatValue2 : fFloatValue3;
            float f22 = (f13 == f11 || d16 != dCeil - 2.0d) ? f12 : (f16 * f18) / f10;
            double d17 = (f13 == f11 || d16 != dCeil - 1.0d) ? f21 : f13;
            float fCos3 = (float) (d17 * Math.cos(d15));
            float f23 = f16;
            float fSin2 = (float) (d17 * Math.sin(d15));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f18659a.lineTo(fCos3, fSin2);
                f15 = fCos3;
                f14 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f19, f20) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f24 = f20;
                float f25 = f19;
                f14 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f26 = z10 ? fFloatValue4 : fFloatValue5;
                float f27 = z10 ? fFloatValue5 : fFloatValue4;
                float f28 = (z10 ? fFloatValue3 : fFloatValue2) * f26 * 0.47829f;
                float f29 = fCos4 * f28;
                float f30 = f28 * fSin3;
                float f31 = (z10 ? fFloatValue2 : fFloatValue3) * f27 * 0.47829f;
                float f32 = fCos5 * f31;
                float f33 = f31 * fSin4;
                if (f18 != 0.0f) {
                    if (i10 == 0) {
                        f29 *= f18;
                        f30 *= f18;
                    } else if (d16 == dCeil - 1.0d) {
                        f32 *= f18;
                        f33 *= f18;
                    }
                }
                f15 = fCos3;
                this.f18659a.cubicTo(f24 - f29, f25 - f30, fCos3 + f32, f14 + f33, f15, f14);
            }
            d15 += (double) f22;
            z10 = !z10;
            i10++;
            f12 = f12;
            f20 = f15;
            f19 = f14;
            f16 = f23;
        }
    }
}
