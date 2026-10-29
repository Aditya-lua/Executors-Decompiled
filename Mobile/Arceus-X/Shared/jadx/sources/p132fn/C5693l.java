package p132fn;

import p061ct.InterfaceC4364a;
import p136ft.C5829c;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p276ln.C8170b;
import p276ln.InterfaceC8169a;

/* JADX INFO: renamed from: fn.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5693l implements InterfaceC5830d<InterfaceC8169a> {

    /* JADX INFO: renamed from: a */
    public final C5691k f21870a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C8170b> f21871b;

    public C5693l(C5691k c5691k, InterfaceC5835i<C8170b> interfaceC5835i) {
        this.f21870a = c5691k;
        this.f21871b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8169a m25824a(C5691k c5691k, InterfaceC4364a<C8170b> interfaceC4364a) {
        return (InterfaceC8169a) C5834h.m26194e(c5691k.m25821a(interfaceC4364a));
    }

    /* JADX INFO: renamed from: b */
    public static C5693l m25825b(C5691k c5691k, InterfaceC5835i<C8170b> interfaceC5835i) {
        return new C5693l(c5691k, interfaceC5835i);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8169a get() {
        return m25824a(this.f21870a, C5829c.m26178b(this.f21871b));
    }
}
