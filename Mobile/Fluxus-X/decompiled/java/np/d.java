package np;

import up.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26285a;

    public d(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26285a = iVar;
    }

    public static d a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.c c(InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.c(inquiryAttributes, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.c b(InquiryAttributes inquiryAttributes) {
        return c(inquiryAttributes, this.f26285a.get());
    }
}
