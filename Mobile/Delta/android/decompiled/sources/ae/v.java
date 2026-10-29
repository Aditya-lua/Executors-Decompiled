package ae;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements o {
    public static void c(ClassLoader classLoader, Set set, u uVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = s.c(classLoader);
        f0 f0VarB = g0.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (zd.q0.class) {
            ArrayList arrayList = new ArrayList((Collection) f0VarB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            f0VarB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = uVar.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (zd.q0.class) {
                g0.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        d0 d0Var = new d0("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(d0Var, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw d0Var;
    }
}
