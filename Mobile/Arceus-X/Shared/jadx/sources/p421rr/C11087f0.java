package p421rr;

import android.content.Context;
import com.withpersona.sdk2.inquiry.p057ui.C4155h;
import com.withpersona.sdk2.inquiry.p057ui.network.C4178b;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p392qr.C10701a;
import p612zq.C14035a;

/* JADX INFO: renamed from: rr.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11087f0 implements InterfaceC5830d<C11084e0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f39137a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C4178b.a> f39138b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10701a.a> f39139c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C14035a.a> f39140d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C4155h.a> f39141e;

    public C11087f0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4178b.a> interfaceC5835i2, InterfaceC5835i<C10701a.a> interfaceC5835i3, InterfaceC5835i<C14035a.a> interfaceC5835i4, InterfaceC5835i<C4155h.a> interfaceC5835i5) {
        this.f39137a = interfaceC5835i;
        this.f39138b = interfaceC5835i2;
        this.f39139c = interfaceC5835i3;
        this.f39140d = interfaceC5835i4;
        this.f39141e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C11087f0 m41813a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4178b.a> interfaceC5835i2, InterfaceC5835i<C10701a.a> interfaceC5835i3, InterfaceC5835i<C14035a.a> interfaceC5835i4, InterfaceC5835i<C4155h.a> interfaceC5835i5) {
        return new C11087f0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C11084e0 m41814c(Context context, C4178b.a aVar, C10701a.a aVar2, C14035a.a aVar3, C4155h.a aVar4) {
        return new C11084e0(context, aVar, aVar2, aVar3, aVar4);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11084e0 get() {
        return m41814c(this.f39137a.get(), this.f39138b.get(), this.f39139c.get(), this.f39140d.get(), this.f39141e.get());
    }
}
