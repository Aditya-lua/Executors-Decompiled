package p028b8;

import p569y7.AbstractC13117d;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;
import p569y7.InterfaceC13121h;
import p569y7.InterfaceC13123j;

/* JADX INFO: renamed from: b8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1270r<T> implements InterfaceC13121h<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC1267o f5286a;

    /* JADX INFO: renamed from: b */
    public final String f5287b;

    /* JADX INFO: renamed from: c */
    public final C13116c f5288c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13120g<T, byte[]> f5289d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1271s f5290e;

    public C1270r(AbstractC1267o abstractC1267o, String str, C13116c c13116c, InterfaceC13120g<T, byte[]> interfaceC13120g, InterfaceC1271s interfaceC1271s) {
        this.f5286a = abstractC1267o;
        this.f5287b = str;
        this.f5288c = c13116c;
        this.f5289d = interfaceC13120g;
        this.f5290e = interfaceC1271s;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7045b(Exception exc) {
    }

    @Override // p569y7.InterfaceC13121h
    /* JADX INFO: renamed from: a */
    public void mo7046a(AbstractC13117d<T> abstractC13117d) {
        m7047c(abstractC13117d, new InterfaceC13123j() { // from class: b8.q
            @Override // p569y7.InterfaceC13123j
            /* JADX INFO: renamed from: a */
            public final void mo7044a(Exception exc) {
                C1270r.m7045b(exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m7047c(AbstractC13117d<T> abstractC13117d, InterfaceC13123j interfaceC13123j) {
        this.f5290e.mo7048a(AbstractC1266n.m7038a().mo7005e(this.f5286a).mo7003c(abstractC13117d).mo7006f(this.f5287b).mo7004d(this.f5289d).mo7002b(this.f5288c).mo7001a(), interfaceC13123j);
    }
}
