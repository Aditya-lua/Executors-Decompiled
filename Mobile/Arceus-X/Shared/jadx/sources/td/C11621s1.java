package td;

import android.content.Context;
import ee.C5071h;

/* JADX INFO: renamed from: td.s1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11621s1 {

    /* JADX INFO: renamed from: a */
    public static C11600l1 f41022a;

    /* JADX INFO: renamed from: a */
    public static synchronized C11600l1 m43282a(Context context) {
        try {
            if (f41022a == null) {
                C11594j1 c11594j1 = new C11594j1(null);
                c11594j1.m43260a(C5071h.m23803a(context));
                f41022a = c11594j1.mo43261b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41022a;
    }
}
