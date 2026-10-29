package p373q7;

import p121f7.C5452i;
import p288m7.C8453a;
import p288m7.C8454b;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.k */
/* JADX INFO: loaded from: classes3.dex */
public class C10460k {

    /* JADX INFO: renamed from: f */
    public static final AbstractC10794c.a f37645f = AbstractC10794c.a.m41143a("ef");

    /* JADX INFO: renamed from: g */
    public static final AbstractC10794c.a f37646g = AbstractC10794c.a.m41143a("nm", "v");

    /* JADX INFO: renamed from: a */
    public C8453a f37647a;

    /* JADX INFO: renamed from: b */
    public C8454b f37648b;

    /* JADX INFO: renamed from: c */
    public C8454b f37649c;

    /* JADX INFO: renamed from: d */
    public C8454b f37650d;

    /* JADX INFO: renamed from: e */
    public C8454b f37651e;

    /* JADX INFO: renamed from: a */
    public final void m40235a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        String strMo41136m = "";
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37646g);
            if (iMo41139r != 0) {
                if (iMo41139r == 1) {
                    strMo41136m.getClass();
                    switch (strMo41136m) {
                        case "Distance":
                            this.f37650d = C10446d.m40210e(abstractC10794c, c5452i);
                            break;
                        case "Opacity":
                            this.f37648b = C10446d.m40211f(abstractC10794c, c5452i, false);
                            break;
                        case "Direction":
                            this.f37649c = C10446d.m40211f(abstractC10794c, c5452i, false);
                            break;
                        case "Shadow Color":
                            this.f37647a = C10446d.m40208c(abstractC10794c, c5452i);
                            break;
                        case "Softness":
                            this.f37651e = C10446d.m40210e(abstractC10794c, c5452i);
                            break;
                        default:
                            abstractC10794c.mo41141u();
                            break;
                    }
                } else {
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                }
            } else {
                strMo41136m = abstractC10794c.mo41136m();
            }
        }
        abstractC10794c.mo41130e();
    }

    /* JADX INFO: renamed from: b */
    public C10458j m40236b(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8454b c8454b;
        C8454b c8454b2;
        C8454b c8454b3;
        C8454b c8454b4;
        while (abstractC10794c.mo41131f()) {
            if (abstractC10794c.mo41139r(f37645f) != 0) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                abstractC10794c.mo41127b();
                while (abstractC10794c.mo41131f()) {
                    m40235a(abstractC10794c, c5452i);
                }
                abstractC10794c.mo41129d();
            }
        }
        C8453a c8453a = this.f37647a;
        if (c8453a == null || (c8454b = this.f37648b) == null || (c8454b2 = this.f37649c) == null || (c8454b3 = this.f37650d) == null || (c8454b4 = this.f37651e) == null) {
            return null;
        }
        return new C10458j(c8453a, c8454b, c8454b2, c8454b3, c8454b4);
    }
}
