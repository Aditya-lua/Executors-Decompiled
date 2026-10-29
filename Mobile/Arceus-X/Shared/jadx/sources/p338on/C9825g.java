package p338on;

import p388qn.C10617m;
import p388qn.C10619o;
import p388qn.C10620p;
import p418rn.InterfaceC10928c;
import sn.C11425i;
import sn.InterfaceC11420d;
import sn.InterfaceC11421e;
import sn.InterfaceC11422f;

/* JADX INFO: renamed from: on.g */
/* JADX INFO: loaded from: classes3.dex */
public class C9825g implements InterfaceC11421e {
    /* JADX INFO: renamed from: b */
    public static InterfaceC11422f m38687b(InterfaceC11420d interfaceC11420d, C11425i c11425i, String str, String str2) {
        return (interfaceC11420d.mo37579a() == null || !interfaceC11420d.mo37579a().m40639o().equals("!")) ? InterfaceC11422f.m42791c(new C10619o(str, str2), c11425i.m42808o()) : InterfaceC11422f.m42791c(new C10617m(str, str2), c11425i.m42808o()).mo38697b();
    }

    @Override // sn.InterfaceC11421e
    /* JADX INFO: renamed from: a */
    public InterfaceC11422f mo38688a(InterfaceC11420d interfaceC11420d, C11425i c11425i, InterfaceC10928c interfaceC10928c) {
        if (interfaceC11420d.mo37583e() != null) {
            return m38687b(interfaceC11420d, c11425i, interfaceC11420d.mo37583e(), interfaceC11420d.mo37580b());
        }
        String strMo37581c = interfaceC11420d.mo37581c();
        if (strMo37581c == null || strMo37581c.isEmpty()) {
            strMo37581c = interfaceC11420d.mo37582d();
        }
        C10620p c10620p = (C10620p) interfaceC10928c.mo37532a(C10620p.class, strMo37581c);
        return c10620p != null ? m38687b(interfaceC11420d, c11425i, c10620p.m40690p(), c10620p.m40692r()) : InterfaceC11422f.m42790a();
    }
}
