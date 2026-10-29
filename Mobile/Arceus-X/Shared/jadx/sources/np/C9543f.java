package np;

import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: np.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9543f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C9539b> f34494a;

    public C9543f(InterfaceC5835i<C9539b> interfaceC5835i) {
        this.f34494a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C9543f m37668a(InterfaceC5835i<C9539b> interfaceC5835i) {
        return new C9543f(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C9542e m37669c(C9539b c9539b, String str) {
        return new C9542e(c9539b, str);
    }

    /* JADX INFO: renamed from: b */
    public C9542e m37670b(String str) {
        return m37669c(this.f34494a.get(), str);
    }
}
