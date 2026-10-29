package p363pq;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: pq.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10310d implements InterfaceC5830d<C10309c> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC10311e> f37114a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC7906p0> f37115b;

    public C10310d(InterfaceC5835i<InterfaceC10311e> interfaceC5835i, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i2) {
        this.f37114a = interfaceC5835i;
        this.f37115b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C10310d m39608a(InterfaceC5835i<InterfaceC10311e> interfaceC5835i, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i2) {
        return new C10310d(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C10309c m39609c(InterfaceC10311e interfaceC10311e, InterfaceC7906p0 interfaceC7906p0) {
        return new C10309c(interfaceC10311e, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10309c get() {
        return m39609c(this.f37114a.get(), this.f37115b.get());
    }
}
