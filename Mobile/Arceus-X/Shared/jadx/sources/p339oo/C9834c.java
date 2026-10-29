package p339oo;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: oo.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9834c implements GovernmentIdHintWorker.b {

    /* JADX INFO: renamed from: a */
    public final C9833b f35666a;

    public C9834c(C9833b c9833b) {
        this.f35666a = c9833b;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<GovernmentIdHintWorker.b> m38717b(C9833b c9833b) {
        return C5831e.m26182a(new C9834c(c9833b));
    }

    @Override // p339oo.GovernmentIdHintWorker.b
    /* JADX INFO: renamed from: a */
    public GovernmentIdHintWorker mo38708a(IdConfig.EnumC3514b enumC3514b) {
        return this.f35666a.m38716b(enumC3514b);
    }
}
