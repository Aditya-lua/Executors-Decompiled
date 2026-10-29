package p373q7;

import android.graphics.PointF;
import java.util.ArrayList;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8457e;
import p288m7.C8461i;
import p288m7.InterfaceC8467o;
import p404r7.AbstractC10794c;
import p431s7.C11197m;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.a */
/* JADX INFO: loaded from: classes3.dex */
public class C10440a {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37616a = AbstractC10794c.a.m41143a("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static C8457e m40190a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        ArrayList arrayList = new ArrayList();
        if (abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY) {
            abstractC10794c.mo41127b();
            while (abstractC10794c.mo41131f()) {
                arrayList.add(C10479z.m40278a(abstractC10794c, c5452i));
            }
            abstractC10794c.mo41129d();
            C10474u.m40267b(arrayList);
        } else {
            arrayList.add(new C11550a(C10472s.m40255e(abstractC10794c, C11197m.m42216e())));
        }
        return new C8457e(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC8467o<PointF, PointF> m40191b(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8457e c8457eM40190a = null;
        C8454b c8454bM40210e = null;
        boolean z10 = false;
        C8454b c8454bM40210e2 = null;
        while (abstractC10794c.mo41137o() != AbstractC10794c.b.END_OBJECT) {
            int iMo41139r = abstractC10794c.mo41139r(f37616a);
            if (iMo41139r == 0) {
                c8457eM40190a = m40190a(abstractC10794c, c5452i);
            } else if (iMo41139r != 1) {
                if (iMo41139r != 2) {
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                } else if (abstractC10794c.mo41137o() == AbstractC10794c.b.STRING) {
                    abstractC10794c.mo41141u();
                    z10 = true;
                } else {
                    c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
                }
            } else if (abstractC10794c.mo41137o() == AbstractC10794c.b.STRING) {
                abstractC10794c.mo41141u();
                z10 = true;
            } else {
                c8454bM40210e2 = C10446d.m40210e(abstractC10794c, c5452i);
            }
        }
        abstractC10794c.mo41130e();
        if (z10) {
            c5452i.m25035a("Lottie doesn't support expressions.");
        }
        return c8457eM40190a != null ? c8457eM40190a : new C8461i(c8454bM40210e2, c8454bM40210e);
    }
}
