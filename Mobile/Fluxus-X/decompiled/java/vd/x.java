package vd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w f34336a;

    public static synchronized w a(Context context) {
        try {
            if (f34336a == null) {
                n1 n1Var = new n1(null);
                n1Var.a(ge.h.a(context));
                f34336a = n1Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34336a;
    }
}
