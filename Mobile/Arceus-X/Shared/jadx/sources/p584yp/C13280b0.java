package p584yp;

import com.withpersona.sdk2.inquiry.selfie.C3942d;
import com.withpersona.sdk2.inquiry.selfie.InterfaceC3958j;
import java.util.Set;
import p016an.InterfaceC0364a0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p611zp.C14021p0;

/* JADX INFO: renamed from: yp.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13280b0 implements InterfaceC5830d<Set<InterfaceC0364a0<?>>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3942d> f46654a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C14021p0> f46655b;

    public C13280b0(InterfaceC5835i<C3942d> interfaceC5835i, InterfaceC5835i<C14021p0> interfaceC5835i2) {
        this.f46654a = interfaceC5835i;
        this.f46655b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13280b0 m49032a(InterfaceC5835i<C3942d> interfaceC5835i, InterfaceC5835i<C14021p0> interfaceC5835i2) {
        return new C13280b0(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static Set<InterfaceC0364a0<?>> m49033c(C3942d c3942d, C14021p0 c14021p0) {
        return (Set) C5834h.m26194e(InterfaceC3958j.m20083a(c3942d, c14021p0));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC0364a0<?>> get() {
        return m49033c(this.f46654a.get(), this.f46655b.get());
    }
}
