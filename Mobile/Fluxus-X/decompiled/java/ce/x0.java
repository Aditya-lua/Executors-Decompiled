package ce;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s0 f5017a;

    public static synchronized s0 a(Context context) {
        try {
            if (f5017a == null) {
                f0 f0Var = new f0(null);
                f0Var.a(new j(de.n0.a(context)));
                f5017a = f0Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5017a;
    }
}
