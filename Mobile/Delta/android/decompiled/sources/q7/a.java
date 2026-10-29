package q7;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29228a = r7.c.a.a("k", "x", "y");

    public static m7.e a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == r7.c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.f()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new t7.a(s.e(cVar, s7.m.e())));
        }
        return new m7.e(arrayList);
    }

    public static m7.o<PointF, PointF> b(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.e eVarA = null;
        m7.b bVarE = null;
        boolean z10 = false;
        m7.b bVarE2 = null;
        while (cVar.o() != r7.c.b.END_OBJECT) {
            int iR = cVar.r(f29228a);
            if (iR == 0) {
                eVarA = a(cVar, iVar);
            } else if (iR != 1) {
                if (iR != 2) {
                    cVar.s();
                    cVar.u();
                } else if (cVar.o() == r7.c.b.STRING) {
                    cVar.u();
                    z10 = true;
                } else {
                    bVarE = d.e(cVar, iVar);
                }
            } else if (cVar.o() == r7.c.b.STRING) {
                cVar.u();
                z10 = true;
            } else {
                bVarE2 = d.e(cVar, iVar);
            }
        }
        cVar.e();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new m7.i(bVarE2, bVarE);
    }
}
