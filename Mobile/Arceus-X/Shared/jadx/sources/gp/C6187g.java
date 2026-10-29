package gp;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6187g implements InterfaceC5830d<FallbackModeService> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23593a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23594b;

    public C6187g(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23593a = c3707f;
        this.f23594b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6187g m27264a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6187g(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static FallbackModeService m27265b(C3707f c3707f, C7397y c7397y) {
        return (FallbackModeService) C5834h.m26194e(c3707f.m18759b(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return m27265b(this.f23593a, this.f23594b.get());
    }
}
