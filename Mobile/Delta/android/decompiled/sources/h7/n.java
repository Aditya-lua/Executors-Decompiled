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
    public final String f19149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f19150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7.k.a f19151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i7.a<?, Float> f19154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i7.a<?, PointF> f19155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i7.a<?, Float> f19156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i7.a<?, Float> f19157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i7.a<?, Float> f19158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i7.a<?, Float> f19159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i7.a<?, Float> f19160p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19162r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19146a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f19147c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f19148d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f19161q = new b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19163a;

        static {
            int[] iArr = new int[n7.k.a.values().length];
            f19163a = iArr;
            try {
                iArr[n7.k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19163a[n7.k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(h0 h0Var, o7.b bVar, n7.k kVar) {
        this.f19150f = h0Var;
        this.f19149e = kVar.d();
        n7.k.a aVarJ = kVar.j();
        this.f19151g = aVarJ;
        this.f19152h = kVar.k();
        this.f19153i = kVar.l();
        i7.d dVarA = kVar.g().a();
        this.f19154j = dVarA;
        i7.a<PointF, PointF> aVarA = kVar.h().a();
        this.f19155k = aVarA;
        i7.d dVarA2 = kVar.i().a();
        this.f19156l = dVarA2;
        i7.d dVarA3 = kVar.e().a();
        this.f19158n = dVarA3;
        i7.d dVarA4 = kVar.f().a();
        this.f19160p = dVarA4;
        n7.k.a aVar = n7.k.a.STAR;
        if (aVarJ == aVar) {
            this.f19157m = kVar.b().a();
            this.f19159o = kVar.c().a();
        } else {
            this.f19157m = null;
            this.f19159o = null;
        }
        bVar.j(dVarA);
        bVar.j(aVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        bVar.j(dVarA4);
        if (aVarJ == aVar) {
            bVar.j(this.f19157m);
            bVar.j(this.f19159o);
        }
        dVarA.a(this);
        aVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
        dVarA4.a(this);
        if (aVarJ == aVar) {
            this.f19157m.a(this);
            this.f19159o.a(this);
        }
    }

    private void k() {
        this.f19162r = false;
        this.f19150f.invalidateSelf();
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
                    this.f19161q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.a<?, Float> aVar;
        i7.a<?, Float> aVar2;
        if (t8 == o0.f17037w) {
            this.f19154j.o(cVar);
            return;
        }
        if (t8 == o0.f17038x) {
            this.f19156l.o(cVar);
            return;
        }
        if (t8 == o0.f17028n) {
            this.f19155k.o(cVar);
            return;
        }
        if (t8 == o0.f17039y && (aVar2 = this.f19157m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t8 == o0.f17040z) {
            this.f19158n.o(cVar);
            return;
        }
        if (t8 == o0.A && (aVar = this.f19159o) != null) {
            aVar.o(cVar);
        } else if (t8 == o0.B) {
            this.f19160p.o(cVar);
        }
    }

    public final void f() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f19154j.h().floatValue());
        i7.a<?, Float> aVar = this.f19156l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f19160p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f19158n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f19146a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFH = this.f19155k.h();
                this.f19146a.offset(pointFH.x, pointFH.y);
                this.f19146a.close();
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
                    this.f19147c.setPath(this.b, false);
                    PathMeasure pathMeasure = this.f19147c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f19148d, null);
                    Path path = this.f19146a;
                    float[] fArr = this.f19148d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f19146a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 != d10 - 1.0d) {
                    this.f19146a.lineTo(fCos, fSin);
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
        return this.f19149e;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f19162r) {
            return this.f19146a;
        }
        this.f19146a.reset();
        if (this.f19152h) {
            this.f19162r = true;
            return this.f19146a;
        }
        int i10 = a.f19163a[this.f19151g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            f();
        }
        this.f19146a.close();
        this.f19161q.b(this.f19146a);
        this.f19162r = true;
        return this.f19146a;
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
        float fFloatValue = this.f19154j.h().floatValue();
        i7.a<?, Float> aVar = this.f19156l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d11);
        if (this.f19153i) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        if (f18 != 0.0f) {
            radians += (double) ((1.0f - f18) * f17);
        }
        float fFloatValue2 = this.f19158n.h().floatValue();
        float fFloatValue3 = this.f19157m.h().floatValue();
        i7.a<?, Float> aVar2 = this.f19159o;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        i7.a<?, Float> aVar3 = this.f19160p;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f18 != 0.0f) {
            f13 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            f11 = 0.0f;
            double d12 = f13;
            f10 = 2.0f;
            float fCos2 = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.f19146a.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f16 * f18) / 2.0f));
            fCos = fCos2;
            f12 = f17;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.f19146a.moveTo(fCos, fSin);
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
                PointF pointFH = this.f19155k.h();
                this.f19146a.offset(pointFH.x, pointFH.y);
                this.f19146a.close();
                return;
            }
            float f21 = z10 ? fFloatValue2 : fFloatValue3;
            float f22 = (f13 == f11 || d16 != dCeil - 2.0d) ? f12 : (f16 * f18) / f10;
            double d17 = (f13 == f11 || d16 != dCeil - 1.0d) ? f21 : f13;
            float fCos3 = (float) (d17 * Math.cos(d15));
            float f23 = f16;
            float fSin2 = (float) (d17 * Math.sin(d15));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f19146a.lineTo(fCos3, fSin2);
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
                this.f19146a.cubicTo(f24 - f29, f25 - f30, fCos3 + f32, f14 + f33, f15, f14);
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
