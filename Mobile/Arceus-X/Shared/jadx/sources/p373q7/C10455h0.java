package p373q7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p266l7.C8002a;
import p303n7.C8909o;
import p404r7.AbstractC10794c;
import p431s7.C11194j;

/* JADX INFO: renamed from: q7.h0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10455h0 implements InterfaceC10467n0<C8909o> {

    /* JADX INFO: renamed from: a */
    public static final C10455h0 f37634a = new C10455h0();

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37635b = AbstractC10794c.a.m41143a("c", "v", "i", "o");

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8909o mo40192a(AbstractC10794c abstractC10794c, float f10) {
        if (abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY) {
            abstractC10794c.mo41127b();
        }
        abstractC10794c.mo41128c();
        List<PointF> listM40256f = null;
        List<PointF> listM40256f2 = null;
        List<PointF> listM40256f3 = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37635b);
            if (iMo41139r == 0) {
                zMo41132g = abstractC10794c.mo41132g();
            } else if (iMo41139r == 1) {
                listM40256f = C10472s.m40256f(abstractC10794c, f10);
            } else if (iMo41139r == 2) {
                listM40256f2 = C10472s.m40256f(abstractC10794c, f10);
            } else if (iMo41139r != 3) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                listM40256f3 = C10472s.m40256f(abstractC10794c, f10);
            }
        }
        abstractC10794c.mo41130e();
        if (abstractC10794c.mo41137o() == AbstractC10794c.b.END_ARRAY) {
            abstractC10794c.mo41129d();
        }
        if (listM40256f == null || listM40256f2 == null || listM40256f3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM40256f.isEmpty()) {
            return new C8909o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listM40256f.size();
        PointF pointF = listM40256f.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listM40256f.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new C8002a(C11194j.m42183a(listM40256f.get(i11), listM40256f3.get(i11)), C11194j.m42183a(pointF2, listM40256f2.get(i10)), pointF2));
        }
        if (zMo41132g) {
            PointF pointF3 = listM40256f.get(0);
            int i12 = size - 1;
            arrayList.add(new C8002a(C11194j.m42183a(listM40256f.get(i12), listM40256f3.get(i12)), C11194j.m42183a(pointF3, listM40256f2.get(0)), pointF3));
        }
        return new C8909o(pointF, zMo41132g, arrayList);
    }
}
