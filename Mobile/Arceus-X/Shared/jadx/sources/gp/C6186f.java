package gp;

import bo.InterfaceC1477c;
import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6186f implements InterfaceC5830d<InterfaceC1477c> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23591a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23592b;

    public C6186f(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23591a = c3707f;
        this.f23592b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6186f m27261a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6186f(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1477c m27262b(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC1477c) C5834h.m26194e(c3707f.m18758a(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1477c get() {
        return m27262b(this.f23591a, this.f23592b.get());
    }
}
