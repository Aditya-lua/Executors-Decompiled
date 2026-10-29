package zo;

import gp.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37849a;

    public d(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f37849a = iVar;
    }

    public static d a(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.c c(InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.c(inquiryAttributes, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.c b(InquiryAttributes inquiryAttributes) {
        return c(inquiryAttributes, this.f37849a.get());
    }
}
