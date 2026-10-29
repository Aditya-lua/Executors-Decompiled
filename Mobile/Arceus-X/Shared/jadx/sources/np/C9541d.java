package np;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: np.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C9541d implements InterfaceC5830d<C9539b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f34491a;

    public C9541d(InterfaceC5835i<Context> interfaceC5835i) {
        this.f34491a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C9541d m37663a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C9541d(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C9539b m37664c(Context context) {
        return new C9539b(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9539b get() {
        return m37664c(this.f34491a.get());
    }
}
