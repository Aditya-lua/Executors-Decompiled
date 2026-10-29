package ae;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements o {
    public static void c(ClassLoader classLoader, Set set) {
        v.c(classLoader, set, new x());
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z10) {
        return s.d(classLoader, file, file2, z10, new t(), "path", new y());
    }

    @Override // ae.o
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z10) {
        return d(classLoader, file, file2, z10);
    }

    @Override // ae.o
    public final void b(ClassLoader classLoader, Set set) {
        c(classLoader, set);
    }
}
