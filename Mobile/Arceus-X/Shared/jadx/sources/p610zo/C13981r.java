package p610zo;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: zo.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C13981r implements InterfaceC5830d<InterfaceC7906p0> {

    /* JADX INFO: renamed from: a */
    public final C13974n f48849a;

    public C13981r(C13974n c13974n) {
        this.f48849a = c13974n;
    }

    /* JADX INFO: renamed from: a */
    public static C13981r m50524a(C13974n c13974n) {
        return new C13981r(c13974n);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC7906p0 m50525c(C13974n c13974n) {
        return (InterfaceC7906p0) C5834h.m26194e(c13974n.getLifecycleCoroutineScope());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7906p0 get() {
        return m50525c(this.f48849a);
    }
}
