package p373q7;

import android.graphics.PointF;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8456d;
import p288m7.C8457e;
import p288m7.C8459g;
import p288m7.C8461i;
import p288m7.C8466n;
import p288m7.InterfaceC8467o;
import p404r7.AbstractC10794c;
import p444t7.C11550a;
import p444t7.C11553d;

/* JADX INFO: renamed from: q7.c */
/* JADX INFO: loaded from: classes3.dex */
public class C10444c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37622a = AbstractC10794c.a.m41143a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37623b = AbstractC10794c.a.m41143a("k");

    /* JADX INFO: renamed from: a */
    public static boolean m40198a(C8457e c8457e) {
        if (c8457e != null) {
            return c8457e.mo34235c() && c8457e.mo34234b().get(0).f40889b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40199b(InterfaceC8467o<PointF, PointF> interfaceC8467o) {
        if (interfaceC8467o != null) {
            return !(interfaceC8467o instanceof C8461i) && interfaceC8467o.mo34235c() && interfaceC8467o.mo34234b().get(0).f40889b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m40200c(C8454b c8454b) {
        if (c8454b != null) {
            return c8454b.mo34235c() && ((Float) ((C11550a) c8454b.mo34234b().get(0)).f40889b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m40201d(C8459g c8459g) {
        if (c8459g != null) {
            return c8459g.mo34235c() && ((C11553d) ((C11550a) c8459g.mo34234b().get(0)).f40889b).m43197a(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static boolean m40202e(C8454b c8454b) {
        if (c8454b != null) {
            return c8454b.mo34235c() && ((Float) ((C11550a) c8454b.mo34234b().get(0)).f40889b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static boolean m40203f(C8454b c8454b) {
        if (c8454b != null) {
            return c8454b.mo34235c() && ((Float) ((C11550a) c8454b.mo34234b().get(0)).f40889b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX INFO: renamed from: g */
    public static C8466n m40204g(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8454b c8454bM40211f;
        C5452i c5452i2 = c5452i;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z10 = abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_OBJECT;
        if (z10) {
            abstractC10794c.mo41128c();
        }
        C8454b c8454b = null;
        C8457e c8457eM40190a = null;
        InterfaceC8467o<PointF, PointF> interfaceC8467oM40191b = null;
        C8459g c8459gM40215j = null;
        C8454b c8454bM40211f2 = null;
        C8454b c8454bM40211f3 = null;
        C8456d c8456dM40213h = null;
        C8454b c8454bM40211f4 = null;
        C8454b c8454bM40211f5 = null;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37622a)) {
                case 0:
                    abstractC10794c.mo41128c();
                    while (abstractC10794c.mo41131f()) {
                        if (abstractC10794c.mo41139r(f37623b) != 0) {
                            abstractC10794c.mo41140s();
                            abstractC10794c.mo41141u();
                        } else {
                            c8457eM40190a = C10440a.m40190a(abstractC10794c, c5452i);
                        }
                    }
                    abstractC10794c.mo41130e();
                    c5452i2 = c5452i;
                    break;
                case 1:
                    interfaceC8467oM40191b = C10440a.m40191b(abstractC10794c, c5452i);
                    c5452i2 = c5452i;
                    break;
                case 2:
                    c8459gM40215j = C10446d.m40215j(abstractC10794c, c5452i);
                    c5452i2 = c5452i;
                    break;
                case 3:
                    c5452i2.m25035a("Lottie doesn't support 3D layers.");
                    c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    if (c8454bM40211f.mo34234b().isEmpty()) {
                        c8454bM40211f.mo34234b().add(new C11550a(c5452i2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c5452i2.m25040f())));
                    } else if (((C11550a) c8454bM40211f.mo34234b().get(0)).f40889b == 0) {
                        c8454bM40211f.mo34234b().set(0, new C11550a(c5452i, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c5452i.m25040f())));
                    }
                    c5452i2 = c5452i;
                    c8454b = c8454bM40211f;
                    break;
                case 4:
                    c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    if (c8454bM40211f.mo34234b().isEmpty()) {
                        c8454bM40211f.mo34234b().add(new C11550a(c5452i2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c5452i2.m25040f())));
                    } else if (((C11550a) c8454bM40211f.mo34234b().get(0)).f40889b == 0) {
                        c8454bM40211f.mo34234b().set(0, new C11550a(c5452i, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c5452i.m25040f())));
                    }
                    c5452i2 = c5452i;
                    c8454b = c8454bM40211f;
                    break;
                case 5:
                    c8456dM40213h = C10446d.m40213h(abstractC10794c, c5452i);
                    break;
                case 6:
                    c8454bM40211f4 = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    break;
                case 7:
                    c8454bM40211f5 = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    break;
                case 8:
                    c8454bM40211f2 = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    break;
                case 9:
                    c8454bM40211f3 = C10446d.m40211f(abstractC10794c, c5452i2, false);
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        if (z10) {
            abstractC10794c.mo41130e();
        }
        C8457e c8457e = m40198a(c8457eM40190a) ? null : c8457eM40190a;
        if (m40199b(interfaceC8467oM40191b)) {
            interfaceC8467oM40191b = null;
        }
        return new C8466n(c8457e, interfaceC8467oM40191b, m40201d(c8459gM40215j) ? null : c8459gM40215j, m40200c(c8454b) ? null : c8454b, c8456dM40213h, c8454bM40211f4, c8454bM40211f5, m40203f(c8454bM40211f2) ? null : c8454bM40211f2, m40202e(c8454bM40211f3) ? null : c8454bM40211f3);
    }
}
