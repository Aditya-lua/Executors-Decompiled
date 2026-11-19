package dl;

import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f12499a;

    @Override // dl.a
    public j getInstance() {
        j jVar;
        synchronized (b) {
            try {
                if (this.f12499a == null) {
                    this.f12499a = new j(CookiePolicy.ACCEPT_ALL);
                }
                jVar = this.f12499a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
