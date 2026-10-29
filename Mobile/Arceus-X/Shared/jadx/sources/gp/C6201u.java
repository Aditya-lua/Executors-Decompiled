package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import java.util.Set;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0368c0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: gp.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C6201u implements InterfaceC5830d<InterfaceC0368c0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Set<InterfaceC0364a0<?>>> f23615a;

    public C6201u(InterfaceC5835i<Set<InterfaceC0364a0<?>>> interfaceC5835i) {
        this.f23615a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6201u m27306a(InterfaceC5835i<Set<InterfaceC0364a0<?>>> interfaceC5835i) {
        return new C6201u(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0368c0 m27307c(Set<InterfaceC0364a0<?>> set) {
        return (InterfaceC0368c0) C5834h.m26194e(C3707f.m18757p(set));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0368c0 get() {
        return m27307c(this.f23615a.get());
    }
}
