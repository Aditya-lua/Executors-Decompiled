package r7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements n0<o7.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f30573a = new h0();
    public static final s7.c.a b = s7.c.a.a("c", "v", "i", "o");

    @Override // r7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o7.o a(s7.c cVar, float f10) {
        if (cVar.p() == s7.c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zG = false;
        while (cVar.f()) {
            int iS = cVar.s(b);
            if (iS == 0) {
                zG = cVar.g();
            } else if (iS == 1) {
                listF = s.f(cVar, f10);
            } else if (iS == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iS != 3) {
                cVar.u();
                cVar.w();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.e();
        if (cVar.p() == s7.c.b.END_ARRAY) {
            cVar.d();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new o7.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new m7.a(t7.j.a(listF.get(i11), listF3.get(i11)), t7.j.a(pointF2, listF2.get(i10)), pointF2));
        }
        if (zG) {
            PointF pointF3 = listF.get(0);
            int i12 = size - 1;
            arrayList.add(new m7.a(t7.j.a(listF.get(i12), listF3.get(i12)), t7.j.a(pointF3, listF2.get(0)), pointF3));
        }
        return new o7.o(pointF, zG, arrayList);
    }
}
