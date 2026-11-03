package td;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w f32302a;

    public static synchronized w a(Context context) {
        try {
            if (f32302a == null) {
                n1 n1Var = new n1(null);
                n1Var.a(ee.h.a(context));
                f32302a = n1Var.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32302a;
    }
}
