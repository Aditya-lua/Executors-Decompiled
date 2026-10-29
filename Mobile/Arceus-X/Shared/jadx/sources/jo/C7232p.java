package jo;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: jo.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C7232p implements InterfaceC5830d<C7230n> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C11930a> f27945a;

    public C7232p(InterfaceC5835i<C11930a> interfaceC5835i) {
        this.f27945a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C7232p m30183a(InterfaceC5835i<C11930a> interfaceC5835i) {
        return new C7232p(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C7230n m30184c(C11930a c11930a) {
        return new C7230n(c11930a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7230n get() {
        return m30184c(this.f27945a.get());
    }
}
