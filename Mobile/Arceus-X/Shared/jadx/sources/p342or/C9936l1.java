package p342or;

import com.withpersona.sdk2.inquiry.p057ui.C4151d;
import mp.InterfaceC8611b;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p392qr.InterfaceC10703c;
import p582yn.InterfaceC13234a;

/* JADX INFO: renamed from: or.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9936l1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC10703c> f35908a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC13234a> f35909b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> f35910c;

    public C9936l1(InterfaceC5835i<InterfaceC10703c> interfaceC5835i, InterfaceC5835i<InterfaceC13234a> interfaceC5835i2, InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i3) {
        this.f35908a = interfaceC5835i;
        this.f35909b = interfaceC5835i2;
        this.f35910c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C9936l1 m38760a(InterfaceC5835i<InterfaceC10703c> interfaceC5835i, InterfaceC5835i<InterfaceC13234a> interfaceC5835i2, InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i3) {
        return new C9936l1(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C4151d m38761c(InterfaceC10703c interfaceC10703c, InterfaceC13234a interfaceC13234a, AbstractC5854c<InterfaceC8611b> abstractC5854c, String str, String str2, String str3, String str4) {
        return new C4151d(interfaceC10703c, interfaceC13234a, abstractC5854c, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    public C4151d m38762b(String str, String str2, String str3, String str4) {
        return m38761c(this.f35908a.get(), this.f35909b.get(), this.f35910c.get(), str, str2, str3, str4);
    }
}
