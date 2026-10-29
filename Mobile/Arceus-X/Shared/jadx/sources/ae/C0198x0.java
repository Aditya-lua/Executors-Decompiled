package ae;

import android.content.Context;
import be.C1345n0;

/* JADX INFO: renamed from: ae.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0198x0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0188s0 f598a;

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC0188s0 m547a(Context context) {
        try {
            if (f598a == null) {
                C0162f0 c0162f0 = new C0162f0(null);
                c0162f0.m519a(new C0169j(C1345n0.m7192a(context)));
                f598a = c0162f0.m520b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f598a;
    }
}
