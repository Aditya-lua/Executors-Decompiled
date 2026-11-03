package uk;

import java.net.CookiePolicy;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f33080a;

    @Override // uk.a
    public j getInstance() {
        j jVar;
        synchronized (b) {
            try {
                if (this.f33080a == null) {
                    this.f33080a = new j(CookiePolicy.ACCEPT_ALL);
                }
                jVar = this.f33080a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
