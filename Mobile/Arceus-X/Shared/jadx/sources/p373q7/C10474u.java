package p373q7;

import java.util.ArrayList;
import java.util.List;
import p121f7.C5452i;
import p189i7.C6651i;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.u */
/* JADX INFO: loaded from: classes3.dex */
public class C10474u {

    /* JADX INFO: renamed from: a */
    public static AbstractC10794c.a f37673a = AbstractC10794c.a.m41143a("k");

    /* JADX INFO: renamed from: a */
    public static <T> List<C11550a<T>> m40266a(AbstractC10794c abstractC10794c, C5452i c5452i, float f10, InterfaceC10467n0<T> interfaceC10467n0, boolean z10) {
        AbstractC10794c abstractC10794c2;
        C5452i c5452i2;
        float f11;
        InterfaceC10467n0<T> interfaceC10467n1;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (abstractC10794c.mo41137o() == AbstractC10794c.b.STRING) {
            c5452i.m25035a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC10794c.mo41128c();
        while (abstractC10794c.mo41131f()) {
            if (abstractC10794c.mo41139r(f37673a) != 0) {
                abstractC10794c.mo41141u();
            } else if (abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY) {
                abstractC10794c.mo41127b();
                if (abstractC10794c.mo41137o() == AbstractC10794c.b.NUMBER) {
                    AbstractC10794c abstractC10794c3 = abstractC10794c;
                    C5452i c5452i3 = c5452i;
                    float f12 = f10;
                    InterfaceC10467n0<T> interfaceC10467n2 = interfaceC10467n0;
                    boolean z12 = z10;
                    C11550a c11550aM40260c = C10473t.m40260c(abstractC10794c3, c5452i3, f12, interfaceC10467n2, false, z12);
                    abstractC10794c2 = abstractC10794c3;
                    c5452i2 = c5452i3;
                    f11 = f12;
                    interfaceC10467n1 = interfaceC10467n2;
                    z11 = z12;
                    arrayList.add(c11550aM40260c);
                } else {
                    abstractC10794c2 = abstractC10794c;
                    c5452i2 = c5452i;
                    f11 = f10;
                    interfaceC10467n1 = interfaceC10467n0;
                    z11 = z10;
                    while (abstractC10794c2.mo41131f()) {
                        arrayList.add(C10473t.m40260c(abstractC10794c2, c5452i2, f11, interfaceC10467n1, true, z11));
                    }
                }
                abstractC10794c2.mo41129d();
                abstractC10794c = abstractC10794c2;
                c5452i = c5452i2;
                f10 = f11;
                interfaceC10467n0 = interfaceC10467n1;
                z10 = z11;
            } else {
                AbstractC10794c abstractC10794c4 = abstractC10794c;
                arrayList.add(C10473t.m40260c(abstractC10794c4, c5452i, f10, interfaceC10467n0, false, z10));
                abstractC10794c = abstractC10794c4;
            }
        }
        abstractC10794c.mo41130e();
        m40267b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m40267b(List<? extends C11550a<T>> list) {
        int i10;
        T t8;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            C11550a<T> c11550a = list.get(i11);
            i11++;
            C11550a<T> c11550a2 = list.get(i11);
            c11550a.f40895h = Float.valueOf(c11550a2.f40894g);
            if (c11550a.f40890c == null && (t8 = c11550a2.f40889b) != null) {
                c11550a.f40890c = t8;
                if (c11550a instanceof C6651i) {
                    ((C6651i) c11550a).m28702j();
                }
            }
        }
        C11550a<T> c11550a3 = list.get(i10);
        if ((c11550a3.f40889b == null || c11550a3.f40890c == null) && list.size() > 1) {
            list.remove(c11550a3);
        }
    }
}
