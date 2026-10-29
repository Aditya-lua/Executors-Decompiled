package p363pq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: pq.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10313g implements InterfaceC5830d<InterfaceC10311e> {

    /* JADX INFO: renamed from: a */
    public final C10312f f37117a;

    public C10313g(C10312f c10312f) {
        this.f37117a = c10312f;
    }

    /* JADX INFO: renamed from: a */
    public static C10313g m39612a(C10312f c10312f) {
        return new C10313g(c10312f);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10311e m39613b(C10312f c10312f) {
        return (InterfaceC10311e) C5834h.m26194e(c10312f.getExternalInquiryController());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10311e get() {
        return m39613b(this.f37117a);
    }
}
