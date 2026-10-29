package bo;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: bo.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1476b implements InterfaceC5830d<C1475a.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC1477c> f5741a;

    public C1476b(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        this.f5741a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C1476b m7580a(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        return new C1476b(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C1475a.a m7581c(InterfaceC1477c interfaceC1477c) {
        return new C1475a.a(interfaceC1477c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1475a.a get() {
        return m7581c(this.f5741a.get());
    }
}
