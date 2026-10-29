package p226jq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p498vq.C12247a;

/* JADX INFO: renamed from: jq.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7258f0 implements InterfaceC5830d<C12247a> {

    /* JADX INFO: renamed from: a */
    public final C7252c0 f28024a;

    public C7258f0(C7252c0 c7252c0) {
        this.f28024a = c7252c0;
    }

    /* JADX INFO: renamed from: a */
    public static C7258f0 m30264a(C7252c0 c7252c0) {
        return new C7258f0(c7252c0);
    }

    /* JADX INFO: renamed from: c */
    public static C12247a m30265c(C7252c0 c7252c0) {
        return (C12247a) C5834h.m26194e(c7252c0.m30225c());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12247a get() {
        return m30265c(this.f28024a);
    }
}
