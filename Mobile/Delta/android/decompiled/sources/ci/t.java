package ci;

import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes2.dex */
public class t implements uk.a {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f5020a;

    @Override // uk.a
    public uk.j getInstance() {
        s sVar;
        synchronized (b) {
            try {
                if (this.f5020a == null) {
                    this.f5020a = new s(CookiePolicy.ACCEPT_ALL);
                }
                sVar = this.f5020a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
