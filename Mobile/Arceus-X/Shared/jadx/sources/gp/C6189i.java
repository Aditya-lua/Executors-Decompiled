package gp;

import com.withpersona.sdk2.inquiry.governmentid.network.InterfaceC3570b;
import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6189i implements InterfaceC5830d<InterfaceC3570b> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23597a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23598b;

    public C6189i(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23597a = c3707f;
        this.f23598b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6189i m27270a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6189i(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC3570b m27271c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC3570b) C5834h.m26194e(c3707f.m18761d(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3570b get() {
        return m27271c(this.f23597a, this.f23598b.get());
    }
}
