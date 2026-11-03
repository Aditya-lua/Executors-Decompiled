package xo;

import ep.InquiryAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f35972a;

    public d(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f35972a = iVar;
    }

    public static d a(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.c c(InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.c(inquiryAttributes, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.c b(InquiryAttributes inquiryAttributes) {
        return c(inquiryAttributes, this.f35972a.get());
    }
}
