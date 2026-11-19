package r7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s7.c.a f30603a = s7.c.a.a("k");

    public static <T> List<u7.a<T>> a(s7.c cVar, g7.i iVar, float f10, n0<T> n0Var, boolean z10) {
        s7.c cVar2;
        g7.i iVar2;
        float f11;
        n0<T> n0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.p() == s7.c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.f()) {
            if (cVar.s(f30603a) != 0) {
                cVar.w();
            } else if (cVar.p() == s7.c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.p() == s7.c.b.NUMBER) {
                    s7.c cVar3 = cVar;
                    g7.i iVar3 = iVar;
                    float f12 = f10;
                    n0<T> n0Var3 = n0Var;
                    boolean z12 = z10;
                    u7.a aVarC = t.c(cVar3, iVar3, f12, n0Var3, false, z12);
                    cVar2 = cVar3;
                    iVar2 = iVar3;
                    f11 = f12;
                    n0Var2 = n0Var3;
                    z11 = z12;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    iVar2 = iVar;
                    f11 = f10;
                    n0Var2 = n0Var;
                    z11 = z10;
                    while (cVar2.f()) {
                        arrayList.add(t.c(cVar2, iVar2, f11, n0Var2, true, z11));
                    }
                }
                cVar2.d();
                cVar = cVar2;
                iVar = iVar2;
                f10 = f11;
                n0Var = n0Var2;
                z10 = z11;
            } else {
                s7.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, iVar, f10, n0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends u7.a<T>> list) {
        int i10;
        T t8;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            u7.a<T> aVar = list.get(i11);
            i11++;
            u7.a<T> aVar2 = list.get(i11);
            aVar.f33242h = Float.valueOf(aVar2.f33241g);
            if (aVar.f33237c == null && (t8 = aVar2.b) != null) {
                aVar.f33237c = t8;
                if (aVar instanceof j7.i) {
                    ((j7.i) aVar).j();
                }
            }
        }
        u7.a<T> aVar3 = list.get(i10);
        if ((aVar3.b == null || aVar3.f33237c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
