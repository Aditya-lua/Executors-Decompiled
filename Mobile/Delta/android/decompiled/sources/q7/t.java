package q7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class t {
    public static w1.k<WeakReference<Interpolator>> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f29270a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r7.c.a f29271c = r7.c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r7.c.a f29272d = r7.c.a.a("x", "y");

    public static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceE;
        synchronized (t.class) {
            weakReferenceE = g().e(i10);
        }
        return weakReferenceE;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = s7.j.b(pointF.x, -1.0f, 1.0f);
        pointF.y = s7.j.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = s7.j.b(pointF2.x, -1.0f, 1.0f);
        float fB = s7.j.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = s7.m.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = f7.e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = z2.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? z2.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!f7.e.e()) {
            try {
                h(i10, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    public static <T> t7.a<T> c(r7.c cVar, f7.i iVar, float f10, n0<T> n0Var, boolean z10, boolean z11) {
        if (z10 && z11) {
            return e(iVar, cVar, f10, n0Var);
        }
        return z10 ? d(iVar, cVar, f10, n0Var) : f(cVar, f10, n0Var);
    }

    public static <T> t7.a<T> d(f7.i iVar, r7.c cVar, float f10, n0<T> n0Var) {
        Interpolator interpolatorB;
        T t8;
        cVar.c();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fH = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (cVar.f()) {
            switch (cVar.r(f29271c)) {
                case 0:
                    fH = (float) cVar.h();
                    break;
                case 1:
                    tA2 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    tA = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z10 = cVar.j() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.u();
                    break;
            }
        }
        cVar.e();
        if (z10) {
            interpolatorB = f29270a;
            t8 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f29270a : b(pointFE, pointFE4);
            t8 = tA;
        }
        t7.a<T> aVar = new t7.a<>(iVar, tA2, t8, interpolatorB, fH, null);
        aVar.f31683o = pointFE2;
        aVar.f31684p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    public static <T> t7.a<T> e(f7.i iVar, r7.c cVar, float f10, n0<T> n0Var) {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t8;
        Interpolator interpolator;
        PointF pointF;
        t7.a<T> aVar;
        PointF pointF2;
        boolean z10;
        float f11;
        cVar.c();
        boolean z11 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fH = 0.0f;
        T tA2 = null;
        while (cVar.f()) {
            switch (cVar.r(f29271c)) {
                case 0:
                    fH = (float) cVar.h();
                    break;
                case 1:
                    tA = n0Var.a(cVar, f10);
                    break;
                case 2:
                    tA2 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (cVar.o() == r7.c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float fH2 = 0.0f;
                        float fH3 = 0.0f;
                        float fH4 = 0.0f;
                        float fH5 = 0.0f;
                        while (cVar.f()) {
                            int iR = cVar.r(f29272d);
                            if (iR == 0) {
                                pointF2 = pointF5;
                                r7.c.b bVarO = cVar.o();
                                r7.c.b bVar = r7.c.b.NUMBER;
                                if (bVarO == bVar) {
                                    fH4 = (float) cVar.h();
                                    fH2 = fH4;
                                } else {
                                    cVar.b();
                                    fH2 = (float) cVar.h();
                                    fH4 = cVar.o() == bVar ? (float) cVar.h() : fH2;
                                    cVar.d();
                                }
                            } else if (iR != 1) {
                                cVar.u();
                            } else {
                                r7.c.b bVarO2 = cVar.o();
                                r7.c.b bVar2 = r7.c.b.NUMBER;
                                if (bVarO2 == bVar2) {
                                    pointF2 = pointF5;
                                    fH5 = (float) cVar.h();
                                    fH3 = fH5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.b();
                                    fH3 = (float) cVar.h();
                                    fH5 = cVar.o() == bVar2 ? (float) cVar.h() : fH3;
                                    cVar.d();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fH2, fH3);
                        pointF4 = new PointF(fH4, fH5);
                        cVar.e();
                    } else {
                        pointFE = s.e(cVar, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (cVar.o() != r7.c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f10);
                    } else {
                        cVar.c();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float fH6 = 0.0f;
                        float fH7 = 0.0f;
                        while (cVar.f()) {
                            int iR2 = cVar.r(f29272d);
                            if (iR2 != 0) {
                                z10 = z11;
                                if (iR2 != 1) {
                                    cVar.u();
                                } else {
                                    r7.c.b bVarO3 = cVar.o();
                                    r7.c.b bVar3 = r7.c.b.NUMBER;
                                    if (bVarO3 == bVar3) {
                                        fH7 = (float) cVar.h();
                                        f13 = fH7;
                                    } else {
                                        cVar.b();
                                        PointF pointF7 = pointFE3;
                                        float fH8 = (float) cVar.h();
                                        fH7 = cVar.o() == bVar3 ? (float) cVar.h() : fH8;
                                        cVar.d();
                                        pointFE3 = pointF7;
                                        f13 = fH8;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF8 = pointFE3;
                                r7.c.b bVarO4 = cVar.o();
                                r7.c.b bVar4 = r7.c.b.NUMBER;
                                if (bVarO4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fH6 = (float) cVar.h();
                                    f12 = fH6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.b();
                                    float fH9 = (float) cVar.h();
                                    if (cVar.o() == bVar4) {
                                        f11 = fH9;
                                        fH6 = (float) cVar.h();
                                    } else {
                                        f11 = fH9;
                                        fH6 = f11;
                                    }
                                    cVar.d();
                                    f12 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF9 = new PointF(f12, f13);
                        PointF pointF10 = new PointF(fH6, fH7);
                        cVar.e();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z11 = cVar.j() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f10);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f10);
                    break;
                default:
                    cVar.u();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF11 = pointF5;
        cVar.e();
        if (z13) {
            interpolator = f29270a;
            t8 = tA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f29270a;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    t8 = tA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new t7.a<>(iVar, tA, t8, interpolator, fH, null);
                } else {
                    pointF = pointFE4;
                    aVar = new t7.a<>(iVar, tA, t8, interpolatorB2, interpolatorB3, fH, null);
                }
                aVar.f31683o = pointFE3;
                aVar.f31684p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            t8 = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new t7.a<>(iVar, tA, t8, interpolator, fH, null);
        } else {
            pointF = pointFE4;
            aVar = new t7.a<>(iVar, tA, t8, interpolator, fH, null);
        }
        aVar.f31683o = pointFE3;
        aVar.f31684p = pointF;
        return aVar;
    }

    public static <T> t7.a<T> f(r7.c cVar, float f10, n0<T> n0Var) {
        return new t7.a<>(n0Var.a(cVar, f10));
    }

    public static w1.k<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new w1.k<>();
        }
        return b;
    }

    public static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            b.i(i10, weakReference);
        }
    }
}
