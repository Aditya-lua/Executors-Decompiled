package sq;

import androidx.p000lifecycle.l0;
import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f31289a;

    public a(i<l0> iVar) {
        this.f31289a = iVar;
    }

    public static a a(i<l0> iVar) {
        return new a(iVar);
    }

    public static com.withpersona.sdk2.inquiry.shared.inquiryTheme.a c(l0 l0Var) {
        return new com.withpersona.sdk2.inquiry.shared.inquiryTheme.a(l0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.shared.inquiryTheme.a get() {
        return c(this.f31289a.get());
    }
}
