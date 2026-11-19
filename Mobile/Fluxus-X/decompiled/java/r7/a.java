package r7;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30558a = s7.c.a.a("k", "x", "y");

    public static n7.e a(s7.c cVar, g7.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.p() == s7.c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.f()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new u7.a(s.e(cVar, t7.m.e())));
        }
        return new n7.e(arrayList);
    }

    public static n7.o<PointF, PointF> b(s7.c cVar, g7.i iVar) {
        cVar.c();
        n7.e eVarA = null;
        n7.b bVarE = null;
        boolean z10 = false;
        n7.b bVarE2 = null;
        while (cVar.p() != s7.c.b.END_OBJECT) {
            int iS = cVar.s(f30558a);
            if (iS == 0) {
                eVarA = a(cVar, iVar);
            } else if (iS != 1) {
                if (iS != 2) {
                    cVar.u();
                    cVar.w();
                } else if (cVar.p() == s7.c.b.STRING) {
                    cVar.w();
                    z10 = true;
                } else {
                    bVarE = d.e(cVar, iVar);
                }
            } else if (cVar.p() == s7.c.b.STRING) {
                cVar.w();
                z10 = true;
            } else {
                bVarE2 = d.e(cVar, iVar);
            }
        }
        cVar.e();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new n7.i(bVarE2, bVarE);
    }
}
