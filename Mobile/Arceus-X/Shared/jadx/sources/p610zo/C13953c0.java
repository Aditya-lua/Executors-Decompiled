package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3692k;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import gp.InterfaceC6203w;
import kr.InterfaceC7814a;
import org.jetbrains.annotations.Nullable;
import p082dp.C4655i;
import p136ft.InterfaceC5835i;
import p525wp.C12504c;
import p582yn.InterfaceC13234a;

/* JADX INFO: renamed from: zo.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13953c0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC6203w> f48729a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC13234a> f48730b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C12504c> f48731c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C4655i> f48732d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<InterfaceC7814a> f48733e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C4007a> f48734f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C3706e> f48735g;

    public C13953c0(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<InterfaceC13234a> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3, InterfaceC5835i<C4655i> interfaceC5835i4, InterfaceC5835i<InterfaceC7814a> interfaceC5835i5, InterfaceC5835i<C4007a> interfaceC5835i6, InterfaceC5835i<C3706e> interfaceC5835i7) {
        this.f48729a = interfaceC5835i;
        this.f48730b = interfaceC5835i2;
        this.f48731c = interfaceC5835i3;
        this.f48732d = interfaceC5835i4;
        this.f48733e = interfaceC5835i5;
        this.f48734f = interfaceC5835i6;
        this.f48735g = interfaceC5835i7;
    }

    /* JADX INFO: renamed from: a */
    public static C13953c0 m50450a(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<InterfaceC13234a> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3, InterfaceC5835i<C4655i> interfaceC5835i4, InterfaceC5835i<InterfaceC7814a> interfaceC5835i5, InterfaceC5835i<C4007a> interfaceC5835i6, InterfaceC5835i<C3706e> interfaceC5835i7) {
        return new C13953c0(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7);
    }

    /* JADX INFO: renamed from: c */
    public static C3692k m50451c(String str, @Nullable String str2, String str3, EnumC13949a0 enumC13949a0, InquirySessionConfig inquirySessionConfig, boolean z10, InterfaceC6203w interfaceC6203w, InterfaceC13234a interfaceC13234a, C12504c c12504c, C4655i c4655i, InterfaceC7814a interfaceC7814a, C4007a c4007a, C3706e c3706e) {
        return new C3692k(str, str2, str3, enumC13949a0, inquirySessionConfig, z10, interfaceC6203w, interfaceC13234a, c12504c, c4655i, interfaceC7814a, c4007a, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3692k m50452b(String str, @Nullable String str2, String str3, EnumC13949a0 enumC13949a0, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return m50451c(str, str2, str3, enumC13949a0, inquirySessionConfig, z10, this.f48729a.get(), this.f48730b.get(), this.f48731c.get(), this.f48732d.get(), this.f48733e.get(), this.f48734f.get(), this.f48735g.get());
    }
}
