package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;
import p392qr.InterfaceC10703c;

/* JADX INFO: renamed from: gp.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6199s implements InterfaceC5830d<InterfaceC10703c> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23611a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23612b;

    public C6199s(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23611a = c3707f;
        this.f23612b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6199s m27300a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6199s(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10703c m27301c(C3707f c3707f, C7397y c7397y) {
        return (InterfaceC10703c) C5834h.m26194e(c3707f.m18767n(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10703c get() {
        return m27301c(this.f23611a, this.f23612b.get());
    }
}
