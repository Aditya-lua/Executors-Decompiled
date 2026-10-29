package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import f1.c2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m1.r1;
import n0.a2;
import n0.g3;
import n0.o0;
import n0.z1;
import n1.c;
import w0.d;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements g3 {
    public static Range<Integer> i(a2.c cVar, r1.a aVar) {
        r1 r1VarA = aVar.a(cVar.i());
        return r1VarA != null ? r1VarA.g() : c2.f15828a;
    }

    private static boolean j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        return j();
    }

    public Map<Integer, a2> g(o0 o0Var, z1 z1Var, r1.a aVar) {
        return j() ? h(o0Var, z1Var, aVar) : Collections.EMPTY_MAP;
    }

    public final Map<Integer, a2> h(o0 o0Var, z1 z1Var, r1.a aVar) {
        a2 a2VarB;
        a2.c cVarB;
        if (!"1".equals(o0Var.e()) || z1Var.a(4) || (cVarB = c.b((a2VarB = z1Var.b(1)))) == null) {
            return null;
        }
        Range<Integer> rangeI = i(cVarB, aVar);
        Size size = d.f33585d;
        a2.b bVarH = a2.b.h(a2VarB.a(), a2VarB.e(), a2VarB.f(), Collections.singletonList(c.a(cVarB, size, rangeI)));
        HashMap map = new HashMap();
        map.put(4, bVarH);
        if (d.c(size) > d.c(cVarB.k())) {
            map.put(1, bVarH);
        }
        return map;
    }
}
