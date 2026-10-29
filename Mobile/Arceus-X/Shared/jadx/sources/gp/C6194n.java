package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: gp.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6194n implements InterfaceC5830d<Boolean> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23604a;

    public C6194n(C3707f c3707f) {
        this.f23604a = c3707f;
    }

    /* JADX INFO: renamed from: a */
    public static C6194n m27285a(C3707f c3707f) {
        return new C6194n(c3707f);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m27286c(C3707f c3707f) {
        return c3707f.getRedactAppIdentifyingInformation();
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(m27286c(this.f23604a));
    }
}
