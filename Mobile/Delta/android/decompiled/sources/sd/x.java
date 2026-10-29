package sd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w f30693a;

    public static synchronized w a(Context context) {
        try {
            if (f30693a == null) {
                n1 n1Var = new n1(null);
                n1Var.a(de.h.a(context));
                f30693a = n1Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30693a;
    }
}
