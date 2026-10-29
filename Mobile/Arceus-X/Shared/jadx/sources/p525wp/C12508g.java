package p525wp;

import okhttp3.Interceptor;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: wp.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C12508g implements InterfaceC5830d<Interceptor> {

    /* JADX INFO: renamed from: a */
    public final C12507f f44706a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C12504c> f44707b;

    public C12508g(C12507f c12507f, InterfaceC5835i<C12504c> interfaceC5835i) {
        this.f44706a = c12507f;
        this.f44707b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C12508g m46837a(C12507f c12507f, InterfaceC5835i<C12504c> interfaceC5835i) {
        return new C12508g(c12507f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static Interceptor m46838c(C12507f c12507f, C12504c c12504c) {
        return (Interceptor) C5834h.m26194e(c12507f.m46835b(c12504c));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Interceptor get() {
        return m46838c(this.f44706a, this.f44707b.get());
    }
}
