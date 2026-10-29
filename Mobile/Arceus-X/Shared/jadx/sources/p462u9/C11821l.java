package p462u9;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: u9.l */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C11821l {
    /* JADX INFO: renamed from: a */
    public static void m44193a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
