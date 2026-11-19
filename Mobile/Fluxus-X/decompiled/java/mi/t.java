package mi;

import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes2.dex */
public class t implements dl.a {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f23296a;

    @Override // dl.a
    public dl.j getInstance() {
        s sVar;
        synchronized (b) {
            try {
                if (this.f23296a == null) {
                    this.f23296a = new s(CookiePolicy.ACCEPT_ALL);
                }
                sVar = this.f23296a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
