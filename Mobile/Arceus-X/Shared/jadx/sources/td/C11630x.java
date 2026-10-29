package td;

import android.content.Context;
import ee.C5071h;

/* JADX INFO: renamed from: td.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C11630x {

    /* JADX INFO: renamed from: a */
    public static InterfaceC11628w f41031a;

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC11628w m43286a(Context context) {
        try {
            if (f41031a == null) {
                C11606n1 c11606n1 = new C11606n1(null);
                c11606n1.m43278a(C5071h.m23803a(context));
                f41031a = c11606n1.mo43279b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41031a;
    }
}
