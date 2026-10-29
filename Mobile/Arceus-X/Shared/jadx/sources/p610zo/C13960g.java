package p610zo;

import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.AbstractC7888l0;
import p582yn.InterfaceC13240d;

/* JADX INFO: renamed from: zo.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13960g implements InterfaceC5830d<C13958f> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC13240d> f48771a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3706e> f48772b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<AbstractC7888l0> f48773c;

    public C13960g(InterfaceC5835i<InterfaceC13240d> interfaceC5835i, InterfaceC5835i<C3706e> interfaceC5835i2, InterfaceC5835i<AbstractC7888l0> interfaceC5835i3) {
        this.f48771a = interfaceC5835i;
        this.f48772b = interfaceC5835i2;
        this.f48773c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C13960g m50460a(InterfaceC5835i<InterfaceC13240d> interfaceC5835i, InterfaceC5835i<C3706e> interfaceC5835i2, InterfaceC5835i<AbstractC7888l0> interfaceC5835i3) {
        return new C13960g(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C13958f m50461c(InterfaceC13240d interfaceC13240d, C3706e c3706e, AbstractC7888l0 abstractC7888l0) {
        return new C13958f(interfaceC13240d, c3706e, abstractC7888l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13958f get() {
        return m50461c(this.f48771a.get(), this.f48772b.get(), this.f48773c.get());
    }
}
