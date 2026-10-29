package p104ei;

import java.net.CookiePolicy;
import p520wk.C12488j;
import p520wk.InterfaceC12479a;

/* JADX INFO: renamed from: ei.t */
/* JADX INFO: loaded from: classes2.dex */
public class C5142t implements InterfaceC12479a {

    /* JADX INFO: renamed from: b */
    public static final Object f20042b = new Object();

    /* JADX INFO: renamed from: a */
    public C5141s f20043a;

    @Override // p520wk.InterfaceC12479a
    public C12488j getInstance() {
        C5141s c5141s;
        synchronized (f20042b) {
            try {
                if (this.f20043a == null) {
                    this.f20043a = new C5141s(CookiePolicy.ACCEPT_ALL);
                }
                c5141s = this.f20043a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5141s;
    }
}
