package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3721v;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13979p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48846a;

    public C13979p0(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48846a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13979p0 m50518a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13979p0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3721v m50519c(String str, String str2, InquirySessionConfig inquirySessionConfig, C3706e c3706e) {
        return new C3721v(str, str2, inquirySessionConfig, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3721v m50520b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return m50519c(str, str2, inquirySessionConfig, this.f48846a.get());
    }
}
