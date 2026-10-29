package be;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: be.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C1359s implements InterfaceC1347o {
    /* JADX INFO: renamed from: c */
    public static Object m7216c(ClassLoader classLoader) {
        return C1324g0.m7158b(classLoader, "pathList", Object.class).m7124a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7217d(ClassLoader classLoader, File file, File file2, boolean z10, InterfaceC1356r interfaceC1356r, String str, InterfaceC1353q interfaceC1353q) {
        ArrayList arrayList = new ArrayList();
        Object objM7216c = m7216c(classLoader);
        C1318e0 c1318e0M7157a = C1324g0.m7157a(objM7216c, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) c1318e0M7157a.m7124a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) C1324g0.m7158b(it.next(), str, File.class).m7124a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !interfaceC1353q.mo7108a(objM7216c, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        c1318e0M7157a.m7109d(Arrays.asList(interfaceC1356r.mo7212a(objM7216c, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        C1315d0 c1315d0 = new C1315d0("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = (IOException) arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c1315d0, iOException);
            } catch (Exception unused) {
            }
        }
        C1324g0.m7157a(objM7216c, "dexElementsSuppressedExceptions", IOException.class).m7109d(arrayList);
        throw c1315d0;
    }
}
