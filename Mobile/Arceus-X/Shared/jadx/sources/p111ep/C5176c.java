package p111ep;

import android.content.Context;
import np.C9542e;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.AbstractC7888l0;

/* JADX INFO: renamed from: ep.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5176c implements InterfaceC5830d<C5174a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f20194a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C9542e.a> f20195b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC5179f> f20196c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<AbstractC7888l0> f20197d;

    public C5176c(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C9542e.a> interfaceC5835i2, InterfaceC5835i<InterfaceC5179f> interfaceC5835i3, InterfaceC5835i<AbstractC7888l0> interfaceC5835i4) {
        this.f20194a = interfaceC5835i;
        this.f20195b = interfaceC5835i2;
        this.f20196c = interfaceC5835i3;
        this.f20197d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C5176c m24071a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C9542e.a> interfaceC5835i2, InterfaceC5835i<InterfaceC5179f> interfaceC5835i3, InterfaceC5835i<AbstractC7888l0> interfaceC5835i4) {
        return new C5176c(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C5174a m24072c(Context context, C9542e.a aVar, InterfaceC5179f interfaceC5179f, AbstractC7888l0 abstractC7888l0) {
        return new C5174a(context, aVar, interfaceC5179f, abstractC7888l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5174a get() {
        return m24072c(this.f20194a.get(), this.f20195b.get(), this.f20196c.get(), this.f20197d.get());
    }
}
