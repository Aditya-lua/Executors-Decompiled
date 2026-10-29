package p582yn;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13254q implements InterfaceC5830d<C13253p> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46608a;

    public C13254q(InterfaceC5835i<Context> interfaceC5835i) {
        this.f46608a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13254q m49008a(InterfaceC5835i<Context> interfaceC5835i) {
        return new C13254q(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C13253p m49009c(Context context) {
        return new C13253p(context);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13253p get() {
        return m49009c(this.f46608a.get());
    }
}
