package p610zo;

import android.content.Context;
import gp.InterfaceC6203w;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p612zq.C14035a;

/* JADX INFO: renamed from: zo.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13971l0 implements InterfaceC5830d<C13969k0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f48834a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C14035a.a> f48835b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC6203w> f48836c;

    public C13971l0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C14035a.a> interfaceC5835i2, InterfaceC5835i<InterfaceC6203w> interfaceC5835i3) {
        this.f48834a = interfaceC5835i;
        this.f48835b = interfaceC5835i2;
        this.f48836c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C13971l0 m50495a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C14035a.a> interfaceC5835i2, InterfaceC5835i<InterfaceC6203w> interfaceC5835i3) {
        return new C13971l0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C13969k0 m50496c(Context context, C14035a.a aVar, InterfaceC6203w interfaceC6203w) {
        return new C13969k0(context, aVar, interfaceC6203w);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13969k0 get() {
        return m50496c(this.f48834a.get(), this.f48835b.get(), this.f48836c.get());
    }
}
