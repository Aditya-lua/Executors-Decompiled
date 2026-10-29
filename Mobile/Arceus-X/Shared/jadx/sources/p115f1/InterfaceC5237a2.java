package p115f1;

import p140g0.C5948v2;
import p140g0.InterfaceC5937t;
import p296n0.C8805p1;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8722a3;

/* JADX INFO: renamed from: f1.a2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5237a2 {

    /* JADX INFO: renamed from: f1.a2$a */
    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    /* JADX INFO: renamed from: a */
    void mo24237a(C5948v2 c5948v2);

    /* JADX INFO: renamed from: b */
    default void mo24238b(C5948v2 c5948v2, EnumC8723a4 enumC8723a4, boolean z10) {
        mo24237a(c5948v2);
    }

    /* JADX INFO: renamed from: c */
    default InterfaceC8722a3<AbstractC5291s> mo24239c() {
        return C8805p1.m35371f(null);
    }

    /* JADX INFO: renamed from: d */
    default void mo24240d(a aVar) {
    }

    /* JADX INFO: renamed from: e */
    default InterfaceC8722a3<AbstractC5257g1> mo24241e() {
        return AbstractC5257g1.f20365c;
    }

    /* JADX INFO: renamed from: f */
    default InterfaceC5260h1 mo24242f(InterfaceC5937t interfaceC5937t, int i10) {
        return InterfaceC5260h1.f20371a;
    }

    /* JADX INFO: renamed from: g */
    default InterfaceC8722a3<Boolean> mo24243g() {
        return C8805p1.m35371f(Boolean.FALSE);
    }
}
