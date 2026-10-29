package p373q7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import p121f7.C5444e;
import p121f7.C5452i;
import p404r7.AbstractC10794c;
import p431s7.C11194j;
import p431s7.C11197m;
import p444t7.C11550a;
import p504w1.C12287k;
import p592z2.C13689a;

/* JADX INFO: renamed from: q7.t */
/* JADX INFO: loaded from: classes3.dex */
public class C10473t {

    /* JADX INFO: renamed from: b */
    public static C12287k<WeakReference<Interpolator>> f37670b;

    /* JADX INFO: renamed from: a */
    public static final Interpolator f37669a = new LinearInterpolator();

    /* JADX INFO: renamed from: c */
    public static AbstractC10794c.a f37671c = AbstractC10794c.a.m41143a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d */
    public static AbstractC10794c.a f37672d = AbstractC10794c.a.m41143a("x", "y");

    /* JADX INFO: renamed from: a */
    public static WeakReference<Interpolator> m40258a(int i10) {
        WeakReference<Interpolator> weakReferenceM45633e;
        synchronized (C10473t.class) {
            weakReferenceM45633e = m40264g().m45633e(i10);
        }
        return weakReferenceM45633e;
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m40259b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorM50007a;
        pointF.x = C11194j.m42184b(pointF.x, -1.0f, 1.0f);
        pointF.y = C11194j.m42184b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C11194j.m42184b(pointF2.x, -1.0f, 1.0f);
        float fM42184b = C11194j.m42184b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM42184b;
        int iM42220i = C11197m.m42220i(pointF.x, pointF.y, pointF2.x, fM42184b);
        WeakReference<Interpolator> weakReferenceM40258a = C5444e.m24926e() ? null : m40258a(iM42220i);
        Interpolator interpolator = weakReferenceM40258a != null ? weakReferenceM40258a.get() : null;
        if (weakReferenceM40258a != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorM50007a = C13689a.m50007a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorM50007a = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? C13689a.m50007a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!C5444e.m24926e()) {
            try {
                m40265h(iM42220i, new WeakReference(interpolatorM50007a));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorM50007a;
    }

    /* JADX INFO: renamed from: c */
    public static <T> C11550a<T> m40260c(AbstractC10794c abstractC10794c, C5452i c5452i, float f10, InterfaceC10467n0<T> interfaceC10467n0, boolean z10, boolean z11) {
        if (z10 && z11) {
            return m40262e(c5452i, abstractC10794c, f10, interfaceC10467n0);
        }
        return z10 ? m40261d(c5452i, abstractC10794c, f10, interfaceC10467n0) : m40263f(abstractC10794c, f10, interfaceC10467n0);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C11550a<T> m40261d(C5452i c5452i, AbstractC10794c abstractC10794c, float f10, InterfaceC10467n0<T> interfaceC10467n0) {
        Interpolator interpolatorM40259b;
        T t8;
        abstractC10794c.mo41128c();
        PointF pointFM40255e = null;
        T tMo40192a = null;
        T tMo40192a2 = null;
        PointF pointFM40255e2 = null;
        PointF pointFM40255e3 = null;
        float fMo41133h = 0.0f;
        boolean z10 = false;
        PointF pointFM40255e4 = null;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37671c)) {
                case 0:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    break;
                case 1:
                    tMo40192a2 = interfaceC10467n0.mo40192a(abstractC10794c, f10);
                    break;
                case 2:
                    tMo40192a = interfaceC10467n0.mo40192a(abstractC10794c, f10);
                    break;
                case 3:
                    pointFM40255e = C10472s.m40255e(abstractC10794c, 1.0f);
                    break;
                case 4:
                    pointFM40255e4 = C10472s.m40255e(abstractC10794c, 1.0f);
                    break;
                case 5:
                    z10 = abstractC10794c.mo41134j() == 1;
                    break;
                case 6:
                    pointFM40255e2 = C10472s.m40255e(abstractC10794c, f10);
                    break;
                case 7:
                    pointFM40255e3 = C10472s.m40255e(abstractC10794c, f10);
                    break;
                default:
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        abstractC10794c.mo41130e();
        if (z10) {
            interpolatorM40259b = f37669a;
            t8 = tMo40192a2;
        } else {
            interpolatorM40259b = (pointFM40255e == null || pointFM40255e4 == null) ? f37669a : m40259b(pointFM40255e, pointFM40255e4);
            t8 = tMo40192a;
        }
        C11550a<T> c11550a = new C11550a<>(c5452i, tMo40192a2, t8, interpolatorM40259b, fMo41133h, null);
        c11550a.f40902o = pointFM40255e2;
        c11550a.f40903p = pointFM40255e3;
        return c11550a;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    /* JADX INFO: renamed from: e */
    public static <T> C11550a<T> m40262e(C5452i c5452i, AbstractC10794c abstractC10794c, float f10, InterfaceC10467n0<T> interfaceC10467n0) {
        Interpolator interpolatorM40259b;
        Interpolator interpolatorM40259b2;
        Interpolator interpolatorM40259b3;
        T t8;
        Interpolator interpolator;
        PointF pointF;
        C11550a<T> c11550a;
        PointF pointF2;
        boolean z10;
        float f11;
        abstractC10794c.mo41128c();
        boolean z11 = false;
        PointF pointFM40255e = null;
        PointF pointFM40255e2 = null;
        PointF pointF3 = null;
        T tMo40192a = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFM40255e3 = null;
        PointF pointFM40255e4 = null;
        float fMo41133h = 0.0f;
        T tMo40192a2 = null;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37671c)) {
                case 0:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    break;
                case 1:
                    tMo40192a = interfaceC10467n0.mo40192a(abstractC10794c, f10);
                    break;
                case 2:
                    tMo40192a2 = interfaceC10467n0.mo40192a(abstractC10794c, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_OBJECT) {
                        abstractC10794c.mo41128c();
                        float fMo41133h2 = 0.0f;
                        float fMo41133h3 = 0.0f;
                        float fMo41133h4 = 0.0f;
                        float fMo41133h5 = 0.0f;
                        while (abstractC10794c.mo41131f()) {
                            int iMo41139r = abstractC10794c.mo41139r(f37672d);
                            if (iMo41139r == 0) {
                                pointF2 = pointF5;
                                AbstractC10794c.b bVarMo41137o = abstractC10794c.mo41137o();
                                AbstractC10794c.b bVar = AbstractC10794c.b.NUMBER;
                                if (bVarMo41137o == bVar) {
                                    fMo41133h4 = (float) abstractC10794c.mo41133h();
                                    fMo41133h2 = fMo41133h4;
                                } else {
                                    abstractC10794c.mo41127b();
                                    fMo41133h2 = (float) abstractC10794c.mo41133h();
                                    fMo41133h4 = abstractC10794c.mo41137o() == bVar ? (float) abstractC10794c.mo41133h() : fMo41133h2;
                                    abstractC10794c.mo41129d();
                                }
                            } else if (iMo41139r != 1) {
                                abstractC10794c.mo41141u();
                            } else {
                                AbstractC10794c.b bVarMo41137o2 = abstractC10794c.mo41137o();
                                AbstractC10794c.b bVar2 = AbstractC10794c.b.NUMBER;
                                if (bVarMo41137o2 == bVar2) {
                                    pointF2 = pointF5;
                                    fMo41133h5 = (float) abstractC10794c.mo41133h();
                                    fMo41133h3 = fMo41133h5;
                                } else {
                                    pointF2 = pointF5;
                                    abstractC10794c.mo41127b();
                                    fMo41133h3 = (float) abstractC10794c.mo41133h();
                                    fMo41133h5 = abstractC10794c.mo41137o() == bVar2 ? (float) abstractC10794c.mo41133h() : fMo41133h3;
                                    abstractC10794c.mo41129d();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fMo41133h2, fMo41133h3);
                        pointF4 = new PointF(fMo41133h4, fMo41133h5);
                        abstractC10794c.mo41130e();
                    } else {
                        pointFM40255e = C10472s.m40255e(abstractC10794c, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (abstractC10794c.mo41137o() != AbstractC10794c.b.BEGIN_OBJECT) {
                        pointFM40255e2 = C10472s.m40255e(abstractC10794c, f10);
                    } else {
                        abstractC10794c.mo41128c();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float fMo41133h6 = 0.0f;
                        float fMo41133h7 = 0.0f;
                        while (abstractC10794c.mo41131f()) {
                            int iMo41139r2 = abstractC10794c.mo41139r(f37672d);
                            if (iMo41139r2 != 0) {
                                z10 = z11;
                                if (iMo41139r2 != 1) {
                                    abstractC10794c.mo41141u();
                                } else {
                                    AbstractC10794c.b bVarMo41137o3 = abstractC10794c.mo41137o();
                                    AbstractC10794c.b bVar3 = AbstractC10794c.b.NUMBER;
                                    if (bVarMo41137o3 == bVar3) {
                                        fMo41133h7 = (float) abstractC10794c.mo41133h();
                                        f13 = fMo41133h7;
                                    } else {
                                        abstractC10794c.mo41127b();
                                        PointF pointF7 = pointFM40255e3;
                                        float fMo41133h8 = (float) abstractC10794c.mo41133h();
                                        fMo41133h7 = abstractC10794c.mo41137o() == bVar3 ? (float) abstractC10794c.mo41133h() : fMo41133h8;
                                        abstractC10794c.mo41129d();
                                        pointFM40255e3 = pointF7;
                                        f13 = fMo41133h8;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF8 = pointFM40255e3;
                                AbstractC10794c.b bVarMo41137o4 = abstractC10794c.mo41137o();
                                AbstractC10794c.b bVar4 = AbstractC10794c.b.NUMBER;
                                if (bVarMo41137o4 == bVar4) {
                                    pointFM40255e3 = pointF8;
                                    fMo41133h6 = (float) abstractC10794c.mo41133h();
                                    f12 = fMo41133h6;
                                } else {
                                    pointFM40255e3 = pointF8;
                                    abstractC10794c.mo41127b();
                                    float fMo41133h9 = (float) abstractC10794c.mo41133h();
                                    if (abstractC10794c.mo41137o() == bVar4) {
                                        f11 = fMo41133h9;
                                        fMo41133h6 = (float) abstractC10794c.mo41133h();
                                    } else {
                                        f11 = fMo41133h9;
                                        fMo41133h6 = f11;
                                    }
                                    abstractC10794c.mo41129d();
                                    f12 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF9 = new PointF(f12, f13);
                        PointF pointF10 = new PointF(fMo41133h6, fMo41133h7);
                        abstractC10794c.mo41130e();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z11 = abstractC10794c.mo41134j() == 1;
                    break;
                case 6:
                    pointFM40255e3 = C10472s.m40255e(abstractC10794c, f10);
                    break;
                case 7:
                    pointFM40255e4 = C10472s.m40255e(abstractC10794c, f10);
                    break;
                default:
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF11 = pointF5;
        abstractC10794c.mo41130e();
        if (z13) {
            interpolator = f37669a;
            t8 = tMo40192a;
        } else {
            if (pointFM40255e == null || pointFM40255e2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorM40259b = f37669a;
                } else {
                    interpolatorM40259b2 = m40259b(pointF3, pointF11);
                    interpolatorM40259b3 = m40259b(pointF4, pointF6);
                    t8 = tMo40192a2;
                    interpolator = null;
                }
                if (interpolatorM40259b2 != null || interpolatorM40259b3 == null) {
                    pointF = pointFM40255e4;
                    c11550a = new C11550a<>(c5452i, tMo40192a, t8, interpolator, fMo41133h, null);
                } else {
                    pointF = pointFM40255e4;
                    c11550a = new C11550a<>(c5452i, tMo40192a, t8, interpolatorM40259b2, interpolatorM40259b3, fMo41133h, null);
                }
                c11550a.f40902o = pointFM40255e3;
                c11550a.f40903p = pointF;
                return c11550a;
            }
            interpolatorM40259b = m40259b(pointFM40255e, pointFM40255e2);
            interpolator = interpolatorM40259b;
            t8 = tMo40192a2;
        }
        interpolatorM40259b2 = null;
        interpolatorM40259b3 = null;
        if (interpolatorM40259b2 != null) {
            pointF = pointFM40255e4;
            c11550a = new C11550a<>(c5452i, tMo40192a, t8, interpolator, fMo41133h, null);
        } else {
            pointF = pointFM40255e4;
            c11550a = new C11550a<>(c5452i, tMo40192a, t8, interpolator, fMo41133h, null);
        }
        c11550a.f40902o = pointFM40255e3;
        c11550a.f40903p = pointF;
        return c11550a;
    }

    /* JADX INFO: renamed from: f */
    public static <T> C11550a<T> m40263f(AbstractC10794c abstractC10794c, float f10, InterfaceC10467n0<T> interfaceC10467n0) {
        return new C11550a<>(interfaceC10467n0.mo40192a(abstractC10794c, f10));
    }

    /* JADX INFO: renamed from: g */
    public static C12287k<WeakReference<Interpolator>> m40264g() {
        if (f37670b == null) {
            f37670b = new C12287k<>();
        }
        return f37670b;
    }

    /* JADX INFO: renamed from: h */
    public static void m40265h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (C10473t.class) {
            f37670b.m45636i(i10, weakReference);
        }
    }
}
