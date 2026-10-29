package be;

import ae.C0184q0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: be.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C1368v implements InterfaceC1347o {
    /* JADX INFO: renamed from: c */
    public static void m7223c(ClassLoader classLoader, Set set, InterfaceC1365u interfaceC1365u) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objM7216c = C1359s.m7216c(classLoader);
        C1321f0 c1321f0M7158b = C1324g0.m7158b(objM7216c, "nativeLibraryDirectories", List.class);
        synchronized (C0184q0.class) {
            ArrayList arrayList = new ArrayList((Collection) c1321f0M7158b.m7124a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            c1321f0M7158b.m7126c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrMo7222a = interfaceC1365u.mo7222a(objM7216c, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (C0184q0.class) {
                C1324g0.m7157a(objM7216c, "nativeLibraryPathElements", Object.class).m7110e(Arrays.asList(objArrMo7222a));
            }
            return;
        }
        C1315d0 c1315d0 = new C1315d0("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c1315d0, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw c1315d0;
    }
}
