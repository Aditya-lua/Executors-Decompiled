package z;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y2 {
    public static String a(a0.p0 p0Var, Integer num, List<String> list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) p0Var.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) p0Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static List<String> b(a0 a0Var, g0.v vVar, List<String> list) throws g0.p1 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            if (vVar == null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                try {
                    strA = a(a0Var.a(), vVar.d(), list);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    if (!str.equals(strA)) {
                        arrayList2.add(a0Var.h(str));
                    }
                }
                Iterator<g0.t> it2 = vVar.b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((n0.o0) it2.next()).e());
                }
            }
            return arrayList;
        } catch (a0.f e10) {
            throw new g0.p1(a3.a(e10));
        } catch (g0.x e11) {
            throw new g0.p1(e11);
        }
    }
}
