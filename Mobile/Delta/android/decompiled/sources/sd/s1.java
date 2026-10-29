package sd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l1 f30687a;

    public static synchronized l1 a(Context context) {
        try {
            if (f30687a == null) {
                j1 j1Var = new j1(null);
                j1Var.a(de.h.a(context));
                f30687a = j1Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30687a;
    }
}
