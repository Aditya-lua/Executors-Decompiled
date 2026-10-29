package ei;

import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes2.dex */
public class t implements wk.a {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f15608a;

    @Override // wk.a
    public wk.j getInstance() {
        s sVar;
        synchronized (b) {
            try {
                if (this.f15608a == null) {
                    this.f15608a = new s(CookiePolicy.ACCEPT_ALL);
                }
                sVar = this.f15608a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
