package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6190j implements InterfaceC5830d<InterfaceC6203w> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23599a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23600b;

    public C6190j(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23599a = c3707f;
        this.f23600b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6190j m27273a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6190j(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6203w m27274c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC6203w) C5834h.m26194e(c3707f.m18762e(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6203w get() {
        return m27274c(this.f23599a, this.f23600b.get());
    }
}
