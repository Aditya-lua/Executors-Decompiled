package p520wk;

import java.net.CookiePolicy;

/* JADX INFO: renamed from: wk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C12480b implements InterfaceC12479a {

    /* JADX INFO: renamed from: b */
    public static final Object f44604b = new Object();

    /* JADX INFO: renamed from: a */
    public C12488j f44605a;

    @Override // p520wk.InterfaceC12479a
    public C12488j getInstance() {
        C12488j c12488j;
        synchronized (f44604b) {
            try {
                if (this.f44605a == null) {
                    this.f44605a = new C12488j(CookiePolicy.ACCEPT_ALL);
                }
                c12488j = this.f44605a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c12488j;
    }
}
