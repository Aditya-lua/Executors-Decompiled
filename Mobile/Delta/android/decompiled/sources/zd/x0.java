package zd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s0 f37514a;

    public static synchronized s0 a(Context context) {
        try {
            if (f37514a == null) {
                f0 f0Var = new f0(null);
                f0Var.a(new j(ae.n0.a(context)));
                f37514a = f0Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37514a;
    }
}
