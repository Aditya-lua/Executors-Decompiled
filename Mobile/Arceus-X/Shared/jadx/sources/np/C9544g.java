package np;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: np.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9544g implements C9542e.a {

    /* JADX INFO: renamed from: a */
    public final C9543f f34495a;

    public C9544g(C9543f c9543f) {
        this.f34495a = c9543f;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5835i<C9542e.a> m37671a(C9543f c9543f) {
        return C5831e.m26182a(new C9544g(c9543f));
    }

    @Override // np.C9542e.a
    public C9542e create(String str) {
        return this.f34495a.m37670b(str);
    }
}
