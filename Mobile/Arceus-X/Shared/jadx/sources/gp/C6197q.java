package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p059cq.InterfaceC4196a;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6197q implements InterfaceC5830d<InterfaceC4196a> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23608a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23609b;

    public C6197q(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23608a = c3707f;
        this.f23609b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6197q m27294a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6197q(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC4196a m27295c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC4196a) C5834h.m26194e(c3707f.m18765l(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4196a get() {
        return m27295c(this.f23608a, this.f23609b.get());
    }
}
