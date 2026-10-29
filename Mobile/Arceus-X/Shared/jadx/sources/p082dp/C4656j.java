package p082dp;

import com.withpersona.sdk2.inquiry.FallbackMode;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p471um.C11888w;
import p610zo.EnumC13962h;

/* JADX INFO: renamed from: dp.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4656j implements InterfaceC5830d<C4655i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<FallbackMode> f19077a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC4647a> f19078b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<EnumC13962h> f19079c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11888w> f19080d;

    public C4656j(InterfaceC5835i<FallbackMode> interfaceC5835i, InterfaceC5835i<InterfaceC4647a> interfaceC5835i2, InterfaceC5835i<EnumC13962h> interfaceC5835i3, InterfaceC5835i<C11888w> interfaceC5835i4) {
        this.f19077a = interfaceC5835i;
        this.f19078b = interfaceC5835i2;
        this.f19079c = interfaceC5835i3;
        this.f19080d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C4656j m22897a(InterfaceC5835i<FallbackMode> interfaceC5835i, InterfaceC5835i<InterfaceC4647a> interfaceC5835i2, InterfaceC5835i<EnumC13962h> interfaceC5835i3, InterfaceC5835i<C11888w> interfaceC5835i4) {
        return new C4656j(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C4655i m22898c(FallbackMode fallbackMode, InterfaceC4647a interfaceC4647a, EnumC13962h enumC13962h, C11888w c11888w) {
        return new C4655i(fallbackMode, interfaceC4647a, enumC13962h, c11888w);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4655i get() {
        return m22898c(this.f19077a.get(), this.f19078b.get(), this.f19079c.get(), this.f19080d.get());
    }
}
