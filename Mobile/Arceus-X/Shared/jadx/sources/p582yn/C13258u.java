package p582yn;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C13258u implements InterfaceC5830d<C13257t> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f46613a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC13250m> f46614b;

    public C13258u(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC13250m> interfaceC5835i2) {
        this.f46613a = interfaceC5835i;
        this.f46614b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13258u m49015a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC13250m> interfaceC5835i2) {
        return new C13258u(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C13257t m49016c(Context context, InterfaceC13250m interfaceC13250m) {
        return new C13257t(context, interfaceC13250m);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13257t get() {
        return m49016c(this.f46613a.get(), this.f46614b.get());
    }
}
