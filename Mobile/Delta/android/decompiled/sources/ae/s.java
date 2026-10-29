package ae;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements o {
    public static Object c(ClassLoader classLoader) {
        return g0.b(classLoader, "pathList", Object.class).a();
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z10, r rVar, String str, q qVar) {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        e0 e0VarA = g0.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) e0VarA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) g0.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !qVar.a(objC, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        e0VarA.d(Arrays.asList(rVar.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        d0 d0Var = new d0("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = (IOException) arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(d0Var, iOException);
            } catch (Exception unused) {
            }
        }
        g0.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw d0Var;
    }
}
