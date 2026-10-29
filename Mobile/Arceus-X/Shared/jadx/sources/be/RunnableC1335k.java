package be;

import ae.InterfaceC0168i0;
import android.util.Log;
import java.util.List;

/* JADX INFO: renamed from: be.k */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1335k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f5374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0168i0 f5375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1338l f5376c;

    public RunnableC1335k(C1338l c1338l, List list, InterfaceC0168i0 interfaceC0168i0) {
        this.f5376c = c1338l;
        this.f5374a = list;
        this.f5375b = interfaceC0168i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f5376c.f5381c.m7189b(this.f5374a)) {
                C1338l.m7182d(this.f5376c, this.f5375b);
            } else {
                C1338l.m7181c(this.f5376c, this.f5374a, this.f5375b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.f5375b.mo524a(-11);
        }
    }
}
