package p531x0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p533x2.C12637g;

/* JADX INFO: renamed from: x0.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C12626z0 {
    /* JADX INFO: renamed from: a */
    public static void m47042a(Collection<Integer> collection, int i10) {
        C12637g.m47070b(collection.contains(Integer.valueOf(i10)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", m47043b(i10), m47044c(collection)));
    }

    /* JADX INFO: renamed from: b */
    public static String m47043b(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static String m47044c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m47043b(it.next().intValue()));
        }
        return "[" + String.join(", ", arrayList) + "]";
    }

    /* JADX INFO: renamed from: d */
    public static int m47045d(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m47046e(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
