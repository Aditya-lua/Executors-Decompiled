package p392qr;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: qr.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10702b implements InterfaceC5830d<C10701a.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC10703c> f38249a;

    public C10702b(InterfaceC5835i<InterfaceC10703c> interfaceC5835i) {
        this.f38249a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C10702b m40792a(InterfaceC5835i<InterfaceC10703c> interfaceC5835i) {
        return new C10702b(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C10701a.a m40793c(InterfaceC10703c interfaceC10703c) {
        return new C10701a.a(interfaceC10703c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10701a.a get() {
        return m40793c(this.f38249a.get());
    }
}
