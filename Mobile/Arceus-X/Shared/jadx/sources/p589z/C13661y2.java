package p589z;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.C0013f;
import p001a0.C0034p0;
import p140g0.C5923p1;
import p140g0.C5945v;
import p140g0.C5953x;
import p140g0.InterfaceC5937t;
import p296n0.InterfaceC8799o0;

/* JADX INFO: renamed from: z.y2 */
/* JADX INFO: loaded from: classes.dex */
public class C13661y2 {
    /* JADX INFO: renamed from: a */
    public static String m49812a(C0034p0 c0034p0, Integer num, List<String> list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) c0034p0.m64c("0").m9a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) c0034p0.m64c("1").m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m49813b(C13476a0 c13476a0, C5945v c5945v, List<String> list) throws C5923p1 {
        String strM49812a;
        try {
            ArrayList arrayList = new ArrayList();
            if (c5945v == null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                try {
                    strM49812a = m49812a(c13476a0.mo35282a(), c5945v.m26629d(), list);
                } catch (IllegalStateException unused) {
                    strM49812a = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    if (!str.equals(strM49812a)) {
                        arrayList2.add(c13476a0.m49164h(str));
                    }
                }
                Iterator<InterfaceC5937t> it2 = c5945v.m26627b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((InterfaceC8799o0) it2.next()).mo6750e());
                }
            }
            return arrayList;
        } catch (C0013f e10) {
            throw new C5923p1(C13479a3.m49169a(e10));
        } catch (C5953x e11) {
            throw new C5923p1(e11);
        }
    }
}
