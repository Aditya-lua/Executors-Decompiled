package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C6196p implements InterfaceC5830d<InterfaceC6205y> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23606a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23607b;

    public C6196p(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23606a = c3707f;
        this.f23607b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6196p m27291a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6196p(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6205y m27292c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC6205y) C5834h.m26194e(c3707f.m18764k(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6205y get() {
        return m27292c(this.f23606a, this.f23607b.get());
    }
}
