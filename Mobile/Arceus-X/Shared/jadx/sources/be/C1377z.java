package be;

import java.io.File;
import java.util.Set;

/* JADX INFO: renamed from: be.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1377z implements InterfaceC1347o {
    /* JADX INFO: renamed from: c */
    public static void m7227c(ClassLoader classLoader, Set set) {
        C1368v.m7223c(classLoader, set, new C1373x());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7228d(ClassLoader classLoader, File file, File file2, boolean z10) {
        return C1359s.m7217d(classLoader, file, file2, z10, new C1362t(), "path", new C1375y());
    }

    @Override // be.InterfaceC1347o
    /* JADX INFO: renamed from: a */
    public final boolean mo7101a(ClassLoader classLoader, File file, File file2, boolean z10) {
        return m7228d(classLoader, file, file2, z10);
    }

    @Override // be.InterfaceC1347o
    /* JADX INFO: renamed from: b */
    public final void mo7102b(ClassLoader classLoader, Set set) {
        m7227c(classLoader, set);
    }
}
