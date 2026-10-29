package q7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r7.c.a f29273a = r7.c.a.a("k");

    public static <T> List<t7.a<T>> a(r7.c cVar, f7.i iVar, float f10, n0<T> n0Var, boolean z10) {
        r7.c cVar2;
        f7.i iVar2;
        float f11;
        n0<T> n0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == r7.c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.f()) {
            if (cVar.r(f29273a) != 0) {
                cVar.u();
            } else if (cVar.o() == r7.c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.o() == r7.c.b.NUMBER) {
                    r7.c cVar3 = cVar;
                    f7.i iVar3 = iVar;
                    float f12 = f10;
                    n0<T> n0Var3 = n0Var;
                    boolean z12 = z10;
                    t7.a aVarC = t.c(cVar3, iVar3, f12, n0Var3, false, z12);
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
                r7.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, iVar, f10, n0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends t7.a<T>> list) {
        int i10;
        T t8;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            t7.a<T> aVar = list.get(i11);
            i11++;
            t7.a<T> aVar2 = list.get(i11);
            aVar.f31676h = Float.valueOf(aVar2.f31675g);
            if (aVar.f31671c == null && (t8 = aVar2.b) != null) {
                aVar.f31671c = t8;
                if (aVar instanceof i7.i) {
                    ((i7.i) aVar).j();
                }
            }
        }
        t7.a<T> aVar3 = list.get(i10);
        if ((aVar3.b == null || aVar3.f31671c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
